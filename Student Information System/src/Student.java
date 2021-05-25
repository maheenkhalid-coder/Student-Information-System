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

    public static void viewStudent() {
        System.out.println("\n**************************************************************************************");
        System.out.println("\t\t\tStudents information ");
        System.out.println("**************************************************************************************");

        for (int i = 0; i < numOfStudent; i++) {
            record = list.get(i);
            record.getStudentInfo();
        }
    }

    public static StudentInfo search(int rollNum) {

        for (int i = 0; i < numOfStudent; i++) {
            record = list.get(i);
            if (record.getRollNumber() == rollNum) {
                System.out.println("\n");
                return record;
            }
        }
        return null;
    }

    public void print(int rollNum) {

        record = search(rollNum);
        if (record == null) {
            System.out.println("The Studnet was not found");
        } else {
            record.getStudentInfo();
        }

    }

    public void deleteStudent(StudentInfo record) {
        list.remove(record);
        numOfStudent--;
        System.out.println("Deleted!!");
    }
}
