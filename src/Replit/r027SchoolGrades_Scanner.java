package Replit;
import java.util.Scanner;
public class r027SchoolGrades_Scanner {
    public static void main(String[] args) {

        String subject1,  subject2, subject3,  subject4, subject5, summary;
        double grade1,  grade2, grade3,  grade4, grade5, average;


        System.out.println("Welcome to the Grader!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter subject name number 1 and score for this subject");
        subject1=scan.nextLine();
        grade1=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 2 and score for this subject");
        subject2=scan.nextLine();
        grade2=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 3 and score for this subject");
        subject3=scan.nextLine();
        grade3=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 4 and score for this subject");
        subject4=scan.nextLine();
        grade4=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 5 and score for this subject");
        subject5=scan.nextLine();
        grade5=scan.nextDouble();
        scan.nextLine();
        summary="Summary: "+subject1+ " - "+grade1+", "+subject2+ " - "+grade2+", "+subject3+ " - "+grade3+", " +subject4+ " - "+grade4+", " +subject5+ " - "+grade5;
        System.out.println(summary);
        average=(grade1+grade2+grade3+grade4+grade5)/5;
        System.out.println("Your average score is: "+average);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");

    }
}
