# Athina

## Table of Contents
- [General Information](#general-information)  
- [Database](#database)  
    - [Database Setup](#database-setup)  

---

## General information
Athina is a University IT system able to support the basic IT needs of any higher education institution.   
It is a team project developed for the needs of the 'Software Engineering' lecture.

---

## Database
Database code is located in `src/main/db`.

### Database setup
1. Execute `DB_setup.sql` to build the database.
2. Execute `DB_data.sql` to insert a testing data set.

### Database Routines
*Global -> All user access*   
*System -> No direct user access, db specific functions*  
*Student -> Student & Secretary access*  
*Secretary -> Secretary access*  

---

1. Global Routines:  
    * `login_function.sql (varchar username, varchar pass, enum('student','secretary','professor','admin') type)`
    * `user_info_procedure.sql (int user_id, enum('student','secretary','professor','admin') type)`
2. System Routines:  
    * `assign_credentials_trigger.sql`
    * `assign_type_trigger.sql`
    * `create_db_user_procedure.sql`
    * `grand_db_privileges_procedure.sql`
    * `remove_db_user_procedure.sql`
3. Student Routines:  
    * `available_lectures_procedure.sql (int student_id)`
    * `current_enrollments_procedure.sql (int student_id)`
    * `new_enrollment_procedure.sql (int student_id, int lecture_id)`
    * `remove_enrollment_procedure.sql (int student_id, int lecture_id)`
    * `show_enrollments_procedure.sql (int student_id)`
4. Secretary Routines:  
    * `register_student_procedure.sql (varchar name, varchar surname, varchar phoneNo, varchar adress)`
    * `remove_student_procedure.sql (int student_id)`
    
