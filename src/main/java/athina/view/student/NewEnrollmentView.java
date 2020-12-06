package athina.view.student;

import athina.controller.StudentController;

public class NewEnrollmentView extends javax.swing.JFrame {
	private static final long serialVersionUID = 3054003590949168789L;
	private StudentController studentController;
	
	public NewEnrollmentView() {
		initComponents();
	}

	public void setController(StudentController studentController) {
		this.studentController = studentController;
	}

	private void onClickEventSubmitEnrollment(java.awt.event.ActionEvent evt) {
		studentController.submitEnrollment();
	}

	public void onClickEventShowNewEnrollment(){ 
	}
	public void updateNewEnrollmentView(){ 
	}
	public static void selectChoosenLectures(){
	}
	public void onClickUploadEditedEnrollment(int id/*,choosenLectures*/){
	}
	
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(NewEnrollmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(NewEnrollmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(NewEnrollmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(NewEnrollmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewEnrollmentView().setVisible(true);
			}
		});
	}

	// UI declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JCheckBox jCheckBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jCheckBox1 = new javax.swing.JCheckBox();
		jLabel6 = new javax.swing.JLabel();
		jCheckBox2 = new javax.swing.JCheckBox();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/athina/view/cropped-ihu-logo_el-16.png"))); // NOI18N
		jLabel1.setText("jLabel1");
		jLabel2.setText(" Διδασκόμενα Μαθήματα τρεχούμενου εξαμήνου");
		jLabel2.setAutoscrolls(true);
		jLabel3.setText("Φοιτητής:");
		jLabel4.setText("StudentName");
		jLabel5.setText("jLabel5");
		jCheckBox1.setText("jCheckBox1");
		jLabel6.setText("jLabel6");
		jCheckBox2.setText("jCheckBox2");
		jButton1.setText("Ολοκλήρωση δήλωσης");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				onClickEventSubmitEnrollment(evt);
			}
		});
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jLabel4)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(0, 37, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
							.addGroup(layout.createSequentialGroup()
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(36, 36, 36))
							.addGroup(layout.createSequentialGroup()
								.addGap(6, 6, 6)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
									.addComponent(jLabel6)
									.addComponent(jLabel5))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(jCheckBox1)
									.addComponent(jCheckBox2))
								.addGap(52, 52, 52))))))
			.addGroup(layout.createSequentialGroup()
				.addGap(88, 88, 88)
				.addComponent(jButton1)
				.addGap(0, 0, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel3)
					.addComponent(jLabel4))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jCheckBox1)
					.addComponent(jLabel5))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel6)
					.addComponent(jCheckBox2))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
				.addComponent(jButton1)
				.addGap(25, 25, 25))
		);
		pack();
	}
	// End of UI declaration
}