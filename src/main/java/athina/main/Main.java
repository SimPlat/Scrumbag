package athina.main;

import athina.model.*;
import athina.controller.*;
import athina.view.global.*;
import athina.view.student.*;
import athina.view.secretary.*;

import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JCheckBox;

public class Main {
	public static void main(String[] args) {
		// Standard generalized variables
		boolean flag = true;             // Wait for connection signal flag
		Connection connection;           // DB Connection 
		User user;                       // Connected user
		UserController controller;       // User controller
		JFrame mainFrame;                // Main frame
		List<Lecture> lectureList;			// List containing all the lectures
		List<JFrame> frameList;     		// User specific frames
		List<JCheckBox> checkboxList;		// List of Components

		// Initialized login frame
		mainFrame = new LoginView(new LoginController());
		mainFrame.setVisible(true);
			
		// Shitty way to implement notify logic
		while(flag){
			flag = !(((LoginView) mainFrame).getController().connected());
			System.out.println("Not connected");
		}
	
		// Current user connection
		connection = ((LoginView) mainFrame).getController().getDbConnection();
			
		// Continue the flow after the connection branching out to specific user type
		switch(((LoginView) mainFrame).getController().getUserType()) {
			case "student":
				// Create user student
				user =  new Student(((LoginView) mainFrame).getController().getUserId(),connection);
				
				// Fill lectureList
				lectureList = new ArrayList<Lecture>();
				for(int i=1; i<=45; i++){
					lectureList.add(new Lecture(i, connection));
				}

				// Create the needed controller, frames for student
				frameList = new ArrayList<JFrame>();
				checkboxList = new ArrayList<JCheckBox>();
				frameList.add(0,new InfoView());
				frameList.add(1,new EnrollmentManagementView());
				frameList.add(2,new RegisterEnrollmentView());
				controller = new StudentController((Student) user,lectureList,checkboxList,frameList,connection);
			 
			 	// Replace login with main menu on the main frame
				mainFrame.dispose();
				mainFrame = new MainMenuView(controller);
				mainFrame.setVisible(true);
				break;
			case "secretary":
				// Create user student
				user =  new Secretary(((LoginView) mainFrame).getController().getUserId(),connection);
				
				// Create the needed controller and frames for student
				frameList = new ArrayList<JFrame>();
				frameList.add(0,new InfoView());
				frameList.add(1,new StudentManagementView());
				frameList.add(2,new RegisterStudentView());
				controller = new SecretaryController((Secretary) user,frameList,connection);
			 
			 	// Replace login with main menu on the main frame
				mainFrame.dispose();
				mainFrame = new MainMenuView(controller);
				mainFrame.setVisible(true);
				break;
			default:
				user = null; // Государственный гимн СССР
		}			
	} 
}