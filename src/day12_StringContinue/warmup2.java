package day12_StringContinue;


import java.util.Scanner;

/*
e initials of the userEx: Enter your first name and last name:
CybertekBatch12output:your initial is: CB
 */
public class warmup2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first name and last name");
        String firstName= scanner.nextLine();
        String lastName=scanner.nextLine();
        String intial=firstName.charAt(0)+"."+lastName.charAt(0);
        //String initial=firstName.substring(0,1)+"."+lastName.substring(0,1); Same REsult
        System.out.println("Your intial is "+ intial);


    }
}
