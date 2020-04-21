package day12_StringContinue;

import java.util.Scanner;

/*
2. write a program that can print user' first and last nameRequiremnt:
first character MUST be capital and remaining characters Must be in lower caseEx:
Enter your first name and last name:mUhTaRcYBERTEKoutput:your full name is: Muhtar Cybertek

 */
public class Warmup3 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please Enter your Name and Last name");
        String firstName=scanner.nextLine();
        String lastName=scanner.nextLine();
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=(""+lastName.charAt(0))+lastName.substring(1).toLowerCase();
        System.out.println(firstName+" "+lastName);


    }
}
