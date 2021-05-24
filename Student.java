import java.util.LinkedList;
import java.util.Scanner;

public class Student {

    private static LinkedList<StudentInfo> list;
    private static StudentInfo record;
    private static int numOfStudent = 0;
    static int totalmarks = 500;
    static int Fees = 5000;
    static int payment;
    static int courseMarks = 100;
    static boolean isFeesPaid = false;
    static boolean isgrade = false;
    static Scanner cin = new Scanner(System.in);

    public Student(LinkedList<StudentInfo> s) {
        list = s;

    }

    public static void addStudent(String fname, String lname, int Age, int rollno, String dept, String Address,
                                  int enrollYear, String number, String email, String course1, String course2, String course3, String course4,
                                  String course5) {

        list.add(new StudentInfo(fname, lname, Age, rollno, dept, Address, enrollYear, number, email, course1, course2,
                course3, course4, course5));
        System.out.println(list);
        numOfStudent++;
    }

    public static void getFees() {
        System.out.println("\n");
        System.out.println("\tFees process\n");
        System.out.println("Your Total Fees is Rs: " + Fees);
        System.out.println("Enter your payemnt Rs:");
        payment = cin.nextInt();
        if (payment == 5000) {
            isFeesPaid = true;
            System.out.println("Thank you for your payemnt!!");
        } else if (payment < 5000) {
            Fees = Fees - payment;
            isFeesPaid = false;
            System.out.println("Your Blance Amount is Rs: " + Fees);
        }

        else {

            System.out.println("Invalid Number\nEnter your Fees again: ");

        }

    }

    public static void getFeesInfo() {
        System.out.println("\n\tFees Status\n");
        if (isFeesPaid == true) {
            System.out.println("Fees paid!!\nFees Submitted.");
        } else if (isFeesPaid == false) {
            System.out.println("Fees unpaid!!\nPlease submit your Fees.");
        }
    }

    public static void result() {
        System.out.println("\n\t\tResult\nPlease enter your subject numbers: ");
        System.out.println("\nEnter course1 marks out of " + courseMarks);
        int c1 = cin.nextInt();
        System.out.println("Enter course2 marks out of " + courseMarks);
        int c2 = cin.nextInt();
        System.out.println("Enter course3 marks out of " + courseMarks);
        int c3 = cin.nextInt();
        System.out.println("Enter course4 marks out of " + courseMarks);
        int c4 = cin.nextInt();
        System.out.println("Enter course 5 marks out of " + courseMarks);
        int c5 = cin.nextInt();
        int sum = c1 + c2 + c3 + c4 + c5;
        float percentage = (sum * 100) / totalmarks;
        System.out.println("From " + totalmarks + " you get " + sum + " marks.");
        System.out.println("\nThe student CGPA is: " + percentage);

        System.out.print("The student Grade is: ");
        if (percentage >= 80) {
            isgrade = true;
            System.out.print("A");
        } else if (percentage >= 60 && percentage < 80) {
            isgrade = true;
            System.out.print("B");
        } else if (percentage >= 50 && percentage < 60) {
            isgrade = true;
            System.out.print("C");
        } else if (percentage >= 40 && percentage < 50) {
            isgrade = false;
            System.out.print("D");
        } else {
            isgrade = true;
            System.out.println("E");
        }

    }

    public static void getResultInfo() {
        System.out.println("\n\t\tRESULT STATUS");
        if (isgrade == true) {
            System.out.println("\t\nPASS\nPass in all courses");
        } else if (isgrade == false) {
            System.out.println("\t\nFAIL\nFail in all courses");
        }

    }

    public static void viewStudent() {
        System.out.println("\t\tStudents information: \n");
        for (int i = 0; i < numOfStudent; i++) {
            record = list.get(i);
            record.getStudentInfo();
            getFeesInfo();
            // getResultInfo();

        }
    }

    public void deleteStudent(StudentInfo record) {
        list.remove(record);
        numOfStudent--;
        System.out.println("Delete!!");
    }

    public static StudentInfo search(int rollNum) {
        for (int i = 0; i < numOfStudent; i++) {
            record = list.get(i);
            if (record.getRollNumber() == rollNum) {
                System.out.println("\n");
                record.getStudentInfo();
                getFeesInfo();
                // getResultInfo();
            }
        }
        return record;
    }

    public void print(int rollNum) {
        record = search(rollNum);
        if (record == null) {
            System.out.println("There is no Student of this Roll number");
        } else {
            record.getStudentInfo();
            getFeesInfo();
            // getResultInfo();
        }

    }
}
