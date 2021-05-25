import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner cin = new Scanner(System.in);
    static boolean isExit = false;
    static int courseMarks = 100;

    public static void addStudentData() {

        try {

            System.out.println("\t\tEnter Student information:\n");
            System.out.println("First Name: ");
            String fname = cin.next();
            System.out.println("Last Name: ");
            String lname = cin.next();
            System.out.println("Roll Number: ");
            int rollNum = cin.nextInt();
            cin.nextLine();
            System.out.println("Department(Like CE,BE,EE): ");
            String depart = cin.nextLine();
            System.out.println("Enrollment Year: ");
            int enrollmentYear = cin.nextInt();
            System.out.println("Age: ");
            int age = cin.nextInt();
            cin.nextLine();
            System.out.println("Address: ");
            String Address = cin.nextLine();
            System.out.println("Email Address: ");
            String email = cin.nextLine();
            System.out.println("Contact Number: ");
            String number = cin.nextLine();
            System.out.printf("\n\tCourse Selection: \n\nPlease Select five of your courses from given list:");
            System.out.println(
                    "\n1.\tENGLISH\n2.\tMATH.\n3.\tJAVA.\n4.\tURDU.\n5.\tDSA.\n6.\tLDST.\n7.\tCVIT.\n8.\tCircuit Analysis.\n9.\tOOP.\n10.\tADVANCE ENGINEERING.");
            System.out.println("Course:01");
            String courseName1 = cin.nextLine();
            System.out.println("Course marks: " + courseMarks);
            System.out.println("Course:02");
            String courseName2 = cin.nextLine();
            System.out.println("Course marks: " + courseMarks);
            System.out.println("Course:03");
            String courseName3 = cin.nextLine();
            System.out.println("Course marks: " + courseMarks);
            System.out.println("Course:04");
            String courseName4 = cin.nextLine();
            System.out.println("Course marks: " + courseMarks);
            System.out.println("Course:05");
            String courseName5 = cin.nextLine();
            System.out.println("Course marks: " + courseMarks);
            System.out.println("\n\tRegistered!");

            Student.addStudent(fname, lname, age, rollNum, depart, Address, enrollmentYear, number, email, courseName1,
                    courseName2, courseName3, courseName4, courseName5);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Student studentData = new Student(new LinkedList<StudentInfo>());

        do {
            System.out.println(
                    "\n\n**************************************************************************************");
            System.out
                    .println("**************************************************************************************");
            System.out.println("\n\t\t\tSTUDENT INFORMATION SYSTEM\n\n");
            System.out
                    .println("**************************************************************************************");
            System.out.println(
                    "**************************************************************************************\n\n");
            System.out.println("\n\t\tPlease select the action you want to perform\n");
            System.out.println("Press 1 for: Register Student");
            System.out.println("Press 2 for: View all student");
            System.out.println("Press 3 for: Fee Submission");
            System.out.println("Press 4 for: To Check Result");
            System.out.println("Press 5 for: find an student");
            System.out.println("Press 6 for: delete an student");
            System.out.println("Press 7 for: Exit");

            int operType = cin.nextInt();

            switch (operType) {
                case 1:

                    addStudentData();// addStudent

                    break;

                case 2:

                    Student.viewStudent(); // ViewStudentData

                    break;

                case 3:

                    // Student.getFeesData();
                    // Student.viewFees();

                    break;

                case 4:

                    // Student.result();
                    // Student.getResultInfo();

                    break;

                case 5:

                    System.out.println("Please enter student roll number"); // Searching
                    int rollNumber = cin.nextInt();
                    Student.search(rollNumber).getStudentInfo();

                    break;

                case 6:

                    System.out.println("Please enter student roll number: "); // deletion
                    rollNumber = cin.nextInt();
                    studentData.deleteStudent(Student.search(rollNumber));

                    break;

                case 7:

                    isExit = true;
                    System.out.println("\n\n\tTHANK YOU!!");

                    break;

                default:
            }

        } while (!isExit);

    }

}
