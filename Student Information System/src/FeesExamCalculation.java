import java.util.Scanner;

public class FeesExamCalculation {

    static int totalmarks = 500;
    static int Fees = 5000;
    static int payment;
    static int courseMarks = 100;
    static boolean isFeesPaid = false;
    static boolean isgrade = false;
    static Scanner cin = new Scanner(System.in);

    public static void getFees() {

        System.out.println("\n");
        System.out.println("**************************************************************************************");
        System.out.println("\t\t\tFees process");
        System.out.println("**************************************************************************************\n");
        System.out.println("You are enrolled in five courses.\nYour Fees is Rs: " + Fees);
        System.out.println("\nEnter your payemnt Rs:");
        payment = cin.nextInt();
        if (payment == 5000) {
            isFeesPaid = true;
            System.out.println("Thank you for your payemnt!!");
        } else if (payment < 5000) {
            Fees = Fees - payment;
            isFeesPaid = false;
            System.out.println("Your Blance Amount is Rs: " + Fees);
        } else {
            System.out.println("Invalid Number\nEnter payment rupees again: ");
            payment = cin.nextInt();
            if (payment == 5000) {
                isFeesPaid = true;
                System.out.println("Thank you for your payemnt!!");
            } else if (payment < 5000) {
                Fees = Fees - payment;
                isFeesPaid = false;
                System.out.println("Your Blance Amount is Rs: " + Fees);
            }

        }

    }

    public static void getFeesInfo() {
        System.out.println("\n**************************************************************************************");
        System.out.println("\t\t\tFees Status");
        System.out.println("**************************************************************************************\n");
        if (isFeesPaid == true) {
            System.out.println("Fees paid!!\nFees Submitted.");
        } else if (isFeesPaid == false) {
            System.out.println("Fees unpaid!!\nPlease submit your Fees.");
        }
    }

    public static void getResult() {

        System.out.println("\n**************************************************************************************");
        System.out.println("\t\t\tResult");
        System.out.println("**************************************************************************************\n");
        System.out.println("\nYou are enrolled in five courses.\n\nPlease enter your courses numbers:");
        System.out.println("\nEnter course1 marks out of " + courseMarks + ":");
        int c1 = cin.nextInt();
        System.out.println("Enter course2 marks out of " + courseMarks + ":");
        int c2 = cin.nextInt();
        System.out.println("Enter course3 marks out of " + courseMarks + ":");
        int c3 = cin.nextInt();
        System.out.println("Enter course4 marks out of " + courseMarks + ":");
        int c4 = cin.nextInt();
        System.out.println("Enter course 5 marks out of " + courseMarks + ":");
        int c5 = cin.nextInt();
        int sum = c1 + c2 + c3 + c4 + c5;
        float percentage = (sum * 100) / totalmarks;
        System.out.println("From " + totalmarks + " marks you score " + sum + " marks.");
        System.out.println("\nThe student CGPA is: " + percentage);

        System.out.print("\nThe student Grade is: ");
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
            isgrade = false;
            System.out.println("E");
        }

    }

    public static void getResultInfo() {
        System.out
                .println("\n\n**************************************************************************************");
        System.out.println("\t\t\tRESULT STATUS");
        System.out.println("**************************************************************************************\n");
        if (isgrade == true) {
            System.out.println("\t\n\tPASS\n\nPass in all courses.");
        } else if (isgrade == false) {
            System.out.println("\t\n\tFAIL\n\nFail in all courses.");
        }

    }

}

