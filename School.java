import java.util.Scanner;

class Student {
    static class One_class {
        String one_student_name;
        int one_student_contact_number;
        String one_student_section;
        double one_total_student_marks;
        private String one_student_password;
        private int one_student_attendance = 0;

        public One_class(String student_name, int student_contact_number, String class_section,double total_student_marks, String student_password) {
            this.one_student_name = student_name;
            this.one_student_contact_number = student_contact_number;
            this.one_student_section = class_section;
            this.one_total_student_marks = total_student_marks;
            this.one_student_password = student_password;

        }

        public void setOne_student_password(String change_password) {
            this.one_student_password = change_password;
        }

        public String getPassword() {
            return one_student_password;
        }

        public int getOne_student_attendance() {
            return one_student_attendance;
        }

        public void incrementAttendance() {
            this.one_student_attendance++;
        }
    }

    static class Two_class {
        String two_student_name;
        int two_student_contact_number;
        String two_student_section;
        private String two_student_password;
        double two_total_student_marks;
        private int two_student_attendance = 0;

        public Two_class(String student_name, int student_contact_number, String class_section,
                double total_student_marks, String student_password) {
            this.two_student_name = student_name;
            this.two_student_contact_number = student_contact_number;
            this.two_student_section = class_section;
            this.two_total_student_marks = total_student_marks;
            this.two_student_password = student_password;
        }

        public void setTwo_student_password(String change_password) {
            this.two_student_password = change_password;
        }

        public String getPassword() {
            return two_student_password;
        }

        public int getTwo_student_attendance() {
            return two_student_attendance;
        }

        public void incrementAttendance() {
            this.two_student_attendance++;
        }
    }
}

class Teacher {
    String teacher_name;
    String email;
    int teacher_contact_number;
    String teacher_subject;
    private String teacher_password;

    public Teacher(String teacher_name, String email, int teacher_contact_number, String teacher_subject,
            String teacher_password) {
        this.teacher_name = teacher_name;
        this.email = email;
        this.teacher_contact_number = teacher_contact_number;
        this.teacher_subject = teacher_subject;
        this.teacher_password = teacher_password;
    }

    public void setTeacher_password(String change_password) {
        this.teacher_password = change_password;
    }

    public String getPassword() {
        return teacher_password;
    }

}

class Admin {
    String admin_name;
    private String admin_password;
    int admin_countact_number;
    String email;

    public Admin(String admin_name, String email, int admin_contact_number, String admin_password) {
        this.admin_name = admin_name;
        this.email = email;
        this.admin_countact_number = admin_contact_number;
        this.admin_password = admin_password;
    }

    public void setAdmin_password(String change_password) {
        this.admin_password = change_password;
    }

    public String getPassword() {
        return admin_password;
    }

}

public class School {
    static Scanner sc = new Scanner(System.in);

    static Student.One_class[] studentsClassOne = new Student.One_class[100];
    static int studentClassOneCount = 0;

    static Student.Two_class[] studentsClassTwo = new Student.Two_class[100];
    static int studentClassTwoCount = 0;

    static Teacher[] teachers = new Teacher[100];
    static int teacherCount = 0;

    static Admin[] admins = new Admin[100];
    static int adminCount = 0;

    public static void main(String[] args) {
        School school = new School();
        int choice;
        System.out.println("1. Teacher Login\n2. Admin Login\n3. Student Login\n4.exit");
        do {
            System.out.print("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    school.Teacher_Login();
                case 2:
                    school.Admin_Login();
                case 3:
                    school.Student_Login();
                case 4:
                    System.out.println("Exiting...");

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    public void Teacher_Registration() {
        System.out.print("Enter Teacher Name:");
        String name = sc.next();
        System.out.print("Enter Teacher Email:");
        String email = sc.next();
        System.out.print("Enter Teacher Contact Number:");
        int contact_number = sc.nextInt();
        System.out.print("Enter Teacher Subject:");
        String subject = sc.next();
        System.out.print("Enter Teacher Password:");
        String password = sc.next();
        teachers[teacherCount] = new Teacher(name, email, contact_number, subject, password);
        teacherCount++;
    }

    public void Teacher_Login() {

		System.out.print("Enter Teacher Email:");
		String email = sc.next();
		for (int i = 0; i < teacherCount; i++) {
			if (teachers[i].email.equals(email)) {
				System.out.print("Enter Teacher Password:");
				String password = sc.next();
				if (teachers[i].getPassword().equals(password)) {


					System.out.println("Login Successful");
					int teacher_choice;

					System.out.println("1. Change Your information\n2. Student Registration\n3.Student Information Change\n4.View Student Attendancen\n5.Enter the all Subject marks 6.Remove Student\n7.View Student Details\n8.Exit");
					do{
					 teacher_choice = sc.nextInt();

					switch (teacher_choice) {
					case 1:

						Change_Your_information(i);
					case 2:

						Student_Registration();
					case 3:
						Student_Information_Change();
					case 4:
						View_Student_Attendance();

					case 5:
						Remove_Student();
					case 6:
						View_Student_Details();
					case 7:
						System.out.println("Exiting...");
					default:
						System.out.println("Invalid choice.");

					}
				}
				while(teacher_choice!=7);

				}
			}
		}
	}

    public void Change_Your_information(int i) {
		// Scanner sc = new Scanner(System.in);
		System.out.println("1. Change Password\n2.Change Contact Number\n3. change Subject\n4.Contact Details");
		int choice ;
		System.out.print("Enter your choice:");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter New Password:");
			String new_password = sc.next();
			teachers[i].setTeacher_password(new_password);
			System.out.println("Password Changed Successfully");
		case 2:
			System.out.print("Enter New Contact Number:");
			int new_contact_number = sc.nextInt();
			teachers[i].teacher_contact_number = new_contact_number;
			System.out.print("Contact Number Changed Successfully");
		case 3:
			System.out.print("Enter New Subject:");
			String new_subject = sc.nextLine();
			teachers[i].teacher_subject = new_subject;
			System.out.println("Subject Changed Successfully");
		case 4:
			System.out.println("Teacher Name: " + teachers[i].teacher_name);
			System.out.println("Teacher Email: " + teachers[i].email);
			System.out.println("Teacher Contact Number: " + teachers[i].teacher_contact_number);
			System.out.println("Teacher Subject: " + teachers[i].teacher_subject);
		default:
			break;
		}

	}

    public void Student_Registration() {

        System.out.print("Enter Student Name:");
        String name = sc.next();
        System.out.println("Enter Student Contact Number:");
        int contact_number = sc.nextInt();
        System.out.println("Enter Student Section:");
        String section = sc.next();
        System.out.print("Enter total student marks:");
        double total_student_marks=sc.nextDouble();

        System.out.println("Enter Student Password:");
        String password = sc.next();
        System.out.println("Enter Class (1 or 2):");
        int class_choice = sc.nextInt();
        switch (class_choice) {
            case 1:
                studentsClassOne[studentClassOneCount++] = new Student.One_class(name, contact_number, section,total_student_marks,password);
                //studentClassOneCount++;
            case 2:
                studentsClassTwo[studentClassTwoCount++] = new Student.Two_class(name, contact_number, section,total_student_marks,password);
                //studentClassTwoCount++;

            default:
                System.out.println("Invalid class choice.");

        }

    }

    public void Student_Information_Change() {

        System.out.print("Enter Student Class (1 or 2):");
        int class_choice = sc.nextInt();
        sc.nextLine();
        switch (class_choice) {
            case 1:

                Change_Student_class_one();
            case 2:

                Change_Student_class_two();

            default:
                System.out.println("Invalid class choice.");
        }
    }

    public void Change_Student_class_one() {

        System.out.print("Enter Student Name to change information:");
        String student_name = sc.next();
        for (int j = 0; j < studentClassOneCount; j++) {
            if (studentsClassOne[j].one_student_name.equals(student_name)) {
                System.out.println("1. Change Password\n2.Change Contact Number\n3. Change Section\n4.Contact Details");
                int student_choice;
                System.out.print("Enter your choice:");
                student_choice = sc.nextInt();
                sc.nextLine();

                switch (student_choice) {
                    case 1:
                        System.out.println("Enter New Password:");
                        String new_password = sc.next();
                        studentsClassOne[j].setOne_student_password(new_password);
                        System.out.println("Password Changed Successfully");

                    case 2:
                        System.out.print("Enter New Contact Number:");
                        int new_contact_number = sc.nextInt();
                        studentsClassOne[j].one_student_contact_number = new_contact_number;
                        System.out.println("Contact Number Changed Successfully");

                    case 3:
                        System.out.print("Enter New Section:");
                        String new_section = sc.next();
                        studentsClassOne[j].one_student_section = new_section;
                        System.out.println("Section Changed Successfully");

                    case 4:
                        System.out.println("Student Name: " + studentsClassOne[j].one_student_name);
                        System.out.println("Student Contact Number: " + studentsClassOne[j].one_student_contact_number);
                        System.out.println("Student Section: " + studentsClassOne[j].one_student_section);
                    default:
                        System.out.println("Invalid choice.");

                }

            }
        }

    }

    public void Change_Student_class_two() {
		System.out.println("Enter Student Name to change information:");
		String student_name = sc.next();
		for (int j = 0; j < studentClassTwoCount; j++) {
			if (studentsClassTwo[j].two_student_name.equals(student_name)) {
				System.out.println("1. Change Password\n2.Change Contact Number\n3. Change Section\n4.Contact Details");
				int student_choice ;
				System.out.print("Enter your choice:");
				student_choice = sc.nextInt();
				sc.nextLine();

				switch (student_choice) {
				case 1:

					System.out.print("Enter New Password:");
					String new_password = sc.next();
					studentsClassTwo[j].setTwo_student_password(new_password);
					System.out.println("Password Changed Successfully");

				case 2:
					System.out.print("Enter New Contact Number:");
					int new_contact_number = sc.nextInt();
					studentsClassTwo[j].two_student_contact_number = new_contact_number;
					System.out.println("Contact Number Changed Successfully");

				case 3:
					System.out.print("Enter New Section:");
					String new_section = sc.next();
					studentsClassTwo[j].two_student_section = new_section;
					System.out.println("Section Changed Successfully");

				case 4:
					System.out.println("Student Name: " + studentsClassTwo[j].two_student_name);
					System.out.println("Student Contact Number: " + studentsClassTwo[j].two_student_contact_number);
					System.out.println("Student Section: " + studentsClassTwo[j].two_student_section);

				default:
					System.out.println("Invalid choice.");

				}


			}
		}
	}

    public void View_Student_Attendance() {
        System.out.println("1.Class one Attendance\n2.Class two Attendance");
        System.out.print("Enter Student Class (1 or 2):");
        int class_choice = sc.nextInt();
        switch (class_choice) {
            case 1:
                class_one_View_Student_Attendance();
            case 2:
                Class_two_View_Student_Attendance();
            default:
                System.out.println("Invalid class choice.");

        }
    }

    public void class_one_View_Student_Attendance() {
        System.out.print("Enter Student Name:");
        String name_one = sc.next();
        for (int j = 0; j < studentClassOneCount; j++) {
            if (studentsClassOne[j].one_student_name.equals(name_one)) {
                System.out.println("Attendance: " + studentsClassOne[j].getOne_student_attendance());
            } else {
                System.out.println("Student not found");
            }
        }
    }

    public void Class_two_View_Student_Attendance() {
        System.out.print("Enter Student Name:");
        String name_two = sc.next();
        for (int j = 0; j < studentClassTwoCount; j++) {
            if (studentsClassTwo[j].two_student_name.equals(name_two)) {
                System.out.println("Attendance: " + studentsClassTwo[j].getTwo_student_attendance());
            } else {
                System.out.println("Student not found");
            }
        }
    }

    public void Remove_Student() {
        System.out.print("Enter Student Class (1 or 2):");
        int class_choice_remove = sc.nextInt();
        sc.nextLine();
        switch (class_choice_remove) {
            case 1:
                System.out.print("Enter Student Name:");
                String name_one = sc.next();
                for (int j = 0; j < studentClassOneCount; j++) {

                    if (studentsClassOne[j].one_student_name.equals(name_one)) {
                        for (int k = j; k < studentClassOneCount - 1; k++) {
                            studentsClassOne[k] = studentsClassOne[k + 1];
                        }
                        studentClassOneCount--;
                        System.out.println("Student Removed Successfully");
                    } else {
                        System.out.println("Student not found");
                    }
                }

            case 2:
                System.out.print("Enter Student Name:");
                String name_two = sc.next();
                for (int j = 0; j < studentClassTwoCount; j++) {
                    if (studentsClassTwo[j].two_student_name.equals(name_two)) {
                        for (int k = j; k < studentClassTwoCount - 1; k++) {
                            studentsClassTwo[k] = studentsClassTwo[k + 1];
                        }
                        studentClassTwoCount--;
                        System.out.println("Student Removed Successfully");
                    } else {
                        System.out.println("Student not found");
                    }
                }
        }
    }

    public void View_Student_Details() {
        System.out.print("Enter Student Class (1 or 2):");
        int class_choice_view = sc.nextInt();
        sc.nextLine();
        switch (class_choice_view) {
            case 1:
                System.out.print("Enter Student Name:");
                String name_one = sc.next();
                for (int j = 0; j < studentClassOneCount; j++) {
                    if (studentsClassOne[j].one_student_name.equals(name_one)) {
                        System.out.println("Student Name: " + studentsClassOne[j].one_student_name);
                        System.out.println("Student Contact Number: " + studentsClassOne[j].one_student_contact_number);
                        System.out.println("Student Section: " + studentsClassOne[j].one_student_section);
                        System.out.println("Student Attendance: " + studentsClassOne[j].getOne_student_attendance());
                    } else {
                        System.out.println("Student not found");
                    }
                }
            case 2:
                System.out.print("Enter Student Name:");
                String name_two = sc.next();
                for (int j = 0; j < studentClassTwoCount; j++) {
                    if (studentsClassTwo[j].two_student_name.equals(name_two)) {
                        System.out.println("Student Name: " + studentsClassTwo[j].two_student_name);
                        System.out.println("Student Contact Number: " + studentsClassTwo[j].two_student_contact_number);
                        System.out.println("Student Section: " + studentsClassTwo[j].two_student_section);
                        System.out.println("Student Attendance: " + studentsClassTwo[j].getTwo_student_attendance());
                    } else {
                        System.out.println("Student not found");
                    }
                }
            default:
                break;
        }

    }

    public void Admin_Login() 
    {

		System.out.println("Enter Admin Email:");
		String email = sc.next();
		for (int i = 0; i < adminCount; i++) {
			if (admins[i].email.equals(email)) {
				System.out.print("Enter Admin Password:");
				String password = sc.next();
				if (admins[i].getPassword().equals(password)) {
					System.out.println("Login Successfull");
					System.out.println("1. Your Information Change\n2.Teacher Information Change\n3.New Teacher Registration\n4.New Admin Registration\n5.Another Admin information Change\n6.Student Information Change");
					int choice ;
					System.out.print("Enter your choice:");
					choice = sc.nextInt();
					sc.nextLine();
					switch (choice) {
					case 1:
						Your_Information_Change(i);
					case 2:
						Teacher_Information_Change();
					case 3:
						Teacher_Registration();
					case 4:
						Admin_Registration();
					case 5:
						Another_Admin_Information_Change();
					case 6:
						Student_Information_Change();

					default:
						System.out.println("Invalid choice.");
					}

				} else {
					System.out.println("Incorrect Password");
				}
			}
			else {
				System.out.println("Admin not found");

			}
		}
	}

    public void Your_Information_Change(int i) {
		// Scanner sc = new Scanner(System.in);
		System.out.println("1. Change Password\n2.Change Contact Number\n3. Change Email\n4. Change Name");
		int admin_choice ;
		System.out.print("Enter your choice:");
		admin_choice = sc.nextInt();
		sc.nextLine();
		switch (admin_choice) {
		case 1:

			System.out.print("Enter New Password:");
			String new_password = sc.next();
			admins[i].setAdmin_password(new_password);
			System.out.println("Password Changed Successfully");
		case 2:

			System.out.print("Enter New Contact Number:");
			int new_contact_number = sc.nextInt();
			admins[i].admin_countact_number = new_contact_number;
			System.out.println("Contact Number Changed Successfully");
		case 3:

			System.out.print("Enter New Email:");
			String new_email = sc.next();
			admins[i].email = new_email;
			System.out.println("Email Changed Successfully");
		case 4:

			System.out.print("Enter New Name:");
			String new_name = sc.next();
			admins[i].admin_name = new_name;
			System.out.println("Name Changed Successfully");
		default:
			System.out.println("Invalid choice.");
		}

	}


    public void Teacher_Information_Change() {

		System.out.print("Enter Teacher Email to change information:");
		String teacher_email = sc.next();
		for (int j = 0; j < teacherCount; j++) {
			if (teachers[j].email.equals(teacher_email)) {
				System.out.println("1. Change Password\n2.Change Contact Number\n3. change Subject\n4.Contact Details");
				int teacher_choice ;
				System.out.print("Enter your choice:");
				teacher_choice = sc.nextInt();
				sc.nextLine();
				switch (teacher_choice) {
				case 1:

					System.out.print("Enter New Password:");
					String new_password = sc.next();
					teachers[j].setTeacher_password(new_password);
					System.out.println("Password Changed Successfully");
				case 2:

					System.out.print("Enter New Contact Number:");
					int new_contact_number = sc.nextInt();
					teachers[j].teacher_contact_number = new_contact_number;
					System.out.println("Contact Number Changed Successfully");
				case 3:

					System.out.print("Enter New Subject:");
					String new_subject = sc.next();
					teachers[j].teacher_subject = new_subject;
					System.out.println("Subject Changed Successfully");
				case 4:

					System.out.println("Teacher Name: " + teachers[j].teacher_name);
					System.out.println("Teacher Email: " + teachers[j].email);
					System.out.println("Teacher Contact Number: " + teachers[j].teacher_contact_number);
					System.out.println("Teacher Subject: " + teachers[j].teacher_subject);
				default:
					System.out.println("Invalid choice.");
				}

			}
			else {
				System.out.println("Teacher not found");
			}
		}
	}


    public void Admin_Registration() {

		System.out.print("Enter Admin Name:");
		String name = sc.next();
		System.out.print("Enter Admin Email:");
		String email = sc.next();
		System.out.println("Enter Admin Contact Number:");
		int contact_number = sc.nextInt();
		System.out.print("Enter Admin Password:");
		String password = sc.next();
		admins[adminCount] = new Admin(name, email, contact_number, password);
		adminCount++;
	}


    public void Another_Admin_Information_Change() {

		System.out.print("Enter Admin Email to change information:");
		String admin_email = sc.next();
		for (int j = 0; j < adminCount; j++) {
			if (admins[j].email.equals(admin_email)) {
				System.out.println("1. Change Password\n2.Change Contact Number\n3. Change Email\n4. Change Name");
				int admin_choice ;
				System.out.print("Enter your choice:");
				admin_choice = sc.nextInt();
				sc.nextLine();
				switch (admin_choice) {
				case 1:

					System.out.print("Enter New Password:");
					String new_password = sc.next();
					admins[j].setAdmin_password(new_password);
					System.out.println("Password Changed Successfully");
				case 2:

					System.out.print("Enter New Contact Number:");
					int new_contact_number = sc.nextInt();
					admins[j].admin_countact_number = new_contact_number;
					System.out.println("Contact Number Changed Successfully");
				case 3:

					System.out.print("Enter New Email:");
					String new_email = sc.next();
					admins[j].email = new_email;
					System.out.println("Email Changed Successfully");
				case 4:

					System.out.print("Enter New Name:");
					String new_name = sc.next();
					admins[j].admin_name = new_name;
					System.out.println("Name Changed Successfully");
				default:
					System.out.println("Invalid choice.");
				}

			}
			else {
				System.out.println("Admin not found");
			}
		}
	}


    public void Student_Login() {
		System.out.print("Enter Class (1 or 2):");
		int class_choice = sc.nextInt();
		sc.nextLine();
		switch (class_choice) {
		case 1:
			Class_one_student_login();
		case 2:
			Class_two_student_login();
		default:
			System.out.println("Invalid class choice.");
		}
	}

    public void Class_one_student_login(){
    System.out.print("Enter Student Name:");
			String name_one = sc.next();
			for (int i = 0; i < studentClassOneCount; i++) {
				if (studentsClassOne[i].one_student_name.equals(name_one)) {
					System.out.print("Enter Student Password:");
					String password_one = sc.next();
					if (studentsClassOne[i].getPassword().equals(password_one)) {
						System.out.println("Login Successful");
						System.out.println("1.Change Your information\n2.View Attendance");
						int student_choice = sc.nextInt();
						switch (student_choice) {
						case 1:
							Change_Student_class_one();
						case 2:
							System.out.println("Attendance: " + studentsClassOne[i].getOne_student_attendance());
						default:
							break;
						}


					} else {
						System.out.println("Incorrect Password");
					}
				} else {
					System.out.println("Student not found");
				}
			}
        }

    public void Class_two_student_login(){
    System.out.print("Enter Student Name:");
			String name_two = sc.next();
			for (int i = 0; i < studentClassTwoCount; i++) {
				if (studentsClassTwo[i].two_student_name.equals(name_two)) {
					System.out.print("Enter Student Password:");
					String password_two = sc.next();
					if (studentsClassTwo[i].getPassword().equals(password_two)) {
						System.out.println("Login Successful");
						System.out.println("1.Change Your information\n2.View Attendance");
						int student_choice = sc.nextInt();
						switch (student_choice) {
						case 1:
							Change_Student_class_two();
						case 2:
							System.out.println("Attendance: " + studentsClassTwo[i].getTwo_student_attendance());
						default:
							break;
						}
					} else {
						System.out.println("Incorrect Password");
					}
				} else {
					System.out.println("Student not found");
				}
			}
        }














}
