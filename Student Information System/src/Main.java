import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable {

	private static final long serialVersionUID = 1L;
	private static int CURRENT_LIMT = 1;
	static Student[] studentArray = new Student[CURRENT_LIMT];
	static int numberOfStudent = 0;
	static Scanner scanner = new Scanner(System.in);

	private static void extentStudentArray() {

		CURRENT_LIMT *= 2;
		Student[] extendedArray = new Student[CURRENT_LIMT];

		for (int index = 0; index < numberOfStudent; index++) {

			Student curentStudent = studentArray[index];
			extendedArray[index] = curentStudent;

		}
		studentArray = extendedArray;

	}

	public static void addStudent() {

		if (numberOfStudent >= CURRENT_LIMT) {
			extentStudentArray();
		}

		System.out.println("\t\tPlease enter your details:\n");
		System.out.println("First Name: ");
		String fname = scanner.nextLine();

		System.out.println("Last Name: ");
		String lname = scanner.nextLine();

		System.out.println("Age: ");
		int Age = scanner.nextInt();

		System.out.println("Roll Number: ");
		int rollno = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Department(Like:CE,BEE,EE,AI): ");
		String dept = scanner.nextLine();

		System.out.println("Address: ");
		String Address = scanner.nextLine();

		System.out.println("Enrollment Year: ");
		int enrollYear = scanner.nextInt();

		System.out.println("Phone Number: ");
		int number = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Email Address: ");
		String email = scanner.next();
		scanner.nextLine();

		System.out.println("\n\t\tPLease enter your courses\t\n");

		System.out.println("Course 01: ");
		String course1 = scanner.next();

		System.out.println("Course 02: ");
		String course2 = scanner.next();

		System.out.println("Course 03: ");
		String course3 = scanner.next();

		System.out.println("Course 04: ");
		String course4 = scanner.next();

		System.out.println("Course 05: ");
		String course5 = scanner.next();

		Student s = new Student(fname, lname, Age, rollno, dept, Address, enrollYear, number, email, course1, course2,
				course3, course4, course5);

		studentArray[numberOfStudent] = s;

		numberOfStudent++;

	}

	public static void deleteStudent(int rollNumber) {

		for (int i = 0; i < numberOfStudent; i++) {

			if (studentArray[i].getRollNumber() == rollNumber) {

				deleteAndShiftArray(i);
				numberOfStudent--;
				break;
			}
		}

	}

	private static void deleteAndShiftArray(int deleteIndex) {

		for (int i = deleteIndex; i < studentArray.length - 1; i++) {
			studentArray[i] = studentArray[i + 1];
		}

	}

	public static void searchStuduent(int rollNumber) {
		for (int i = 0; i < numberOfStudent; i++) {
			if (studentArray[i].getRollNumber() == rollNumber) {
				System.out.println("\n\n\tStudent personal Information\n\nFirst Name: " + studentArray[i].getFirstName()
						+ "\nLast Name: " + studentArray[i].getLastName() + "\nAge: " + studentArray[i].getAge()
						+ "\nRoll No: " + studentArray[i].getRollNumber() + "\nDepartment: "
						+ studentArray[i].getDepartment() + "\nAddress: " + studentArray[i].getAddress()
						+ "\nEnrollment Year: " + studentArray[i].getEnrollmentYear() + "\nPhone Number: "
						+ studentArray[i].getPhoneNumber() + "\nEmail: " + studentArray[i].getEmailAdress()
						+ "\n \n \tStudent course Information\n\n" + "Your Courses:\n"
						+ studentArray[i].getCourseName1() + "\n" + studentArray[i].getCourseName2() + "\n"
						+ studentArray[i].getCourseName3() + "\n" + studentArray[i].getCourseName4() + "\n"
						+ studentArray[i].getCourseName5());
			}

		}
	}

	public static void printStudentData() {

		for (int i = 0; i < numberOfStudent; i++) {

			System.out.println("\n\n\tStudent personal Information\n\nFirst Name: " + studentArray[i].getFirstName()
					+ "\nLast Name: " + studentArray[i].getLastName() + "\nAge: " + studentArray[i].getAge()
					+ "\nRoll No: " + studentArray[i].getRollNumber() + "\nDepartment: "
					+ studentArray[i].getDepartment() + "\nAddress: " + studentArray[i].getAddress()
					+ "\nEnrollment Year: " + studentArray[i].getEnrollmentYear() + "\nPhone Number: "
					+ studentArray[i].getPhoneNumber() + "\nEmail: " + studentArray[i].getEmailAdress()
					+ "\n \n \tStudent course Information\n\n" + "Your Courses:\n" + studentArray[i].getCourseName1()
					+ "\n" + studentArray[i].getCourseName2() + "\n" + studentArray[i].getCourseName3() + "\n"
					+ studentArray[i].getCourseName4() + "\n" + studentArray[i].getCourseName5());

		}

	}

	public static void main(String[] args) {

		System.out.println("\n\t\t\tWELCOME TO THE PROJECT STUDENT INFORMATION SYSTEM\t\t\n\n");
		int code;
		boolean isExit = false;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\t\t\t\tStudent Information Menu\n\n");
			System.out.println("\t1. Add Student\t  2. View Students\t3. Search Student\t4. Delete Student\t5. Exit");
			System.out.println("\nEnter a choice: ");

			code = scanner.nextInt();
			switch (code) {

			case 1:

				addStudent();

				break;

			case 2:

				printStudentData();

				break;

			case 3:

				System.out.println("\nPlease enter your Roll Number: ");
				System.out.println("\n");
				int rollNumber = scanner.nextInt();
				System.out.println("\nYour Details: \n");
				searchStuduent(rollNumber);

				break;

			case 4:

				System.out.println("Please enter your Roll Number: ");
				System.out.println("\n");
				int rollNumber1 = scanner.nextInt();
				deleteStudent(rollNumber1);
				System.out.println("\nStudent has beeen removed!!");

				break;

			case 5:

				isExit = true;
				break;

			default:
			}

		} while (!isExit);

	}

}
