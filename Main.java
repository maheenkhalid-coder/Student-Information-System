import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner cin = new Scanner(System.in);
    static boolean isExit = false;
    static int courseMarks = 100;

    public static void addStudentData() {

        System.out.println("\t\tEnter Student information:\n");
        System.out.println("First Name: ");
        String fname = cin.nextLine();
        cin.nextLine();
        System.out.println("Last Name: ");
        String lname = cin.nextLine();
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
        System.out.printf("Please Select five of your courses from given list:");
        System.out.println(
                "\n1.\tENGLISH\n2.\tMATH.\n3.\tJAVA.\n4.\tURDU.\n5.\tCOMPUTER.\n6.\tSCIENCE.\n7.\tSTRINGS.\n8.\tBIT COINS.\n9.\tINTERNET.\n10.\tADVANCE ENGINEERING.");
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

        Student.addStudent(fname, lname, age, rollNum, depart, Address, enrollmentYear, number, email, courseName1,
                courseName2, courseName3, courseName4, courseName5);
        Student.getFees();
        Student.getFeesInfo();

    }

    public static void main(String[] args) {

        Student studentData = new Student(new LinkedList<StudentInfo>());


        do {
            System.out.println("\n\t\tPlease select the action you want to perform\n");
            System.out.println("Press 1 for: Register Student");
            System.out.println("Press 2 for: View all student");
            System.out.println("Press 3 for: To Check Result");
            System.out.println("Press 4 for: find an student");
            System.out.println("Press 5 for: delete an student");
            System.out.println("Press 6 for: Exit");

            int operType = cin.nextInt();

            switch (operType) {
                case 1:

                    addStudentData();// add

                    break;

                case 2:

                    Student.viewStudent();

                    break;

                case 3:
                    Student.result();
                    Student.getResultInfo();
                    break;

                case 4:
                    System.out.println("Please enter student roll number"); // Searchong
                    int rollNumber = cin.nextInt();
                    Student.search(rollNumber).getStudentInfo();
                    break;

                case 5:
                    System.out.println("Please enter student roll number: "); // deletion
                    rollNumber = cin.nextInt();
                    studentData.deleteStudent(Student.search(rollNumber));
                    break;
                case 6:
                    isExit = true;
                    break;

                default:
            }

        } while (!isExit);

    }

}
