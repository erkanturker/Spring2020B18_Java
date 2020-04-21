package day11_Scanner_String;

import java.util.Scanner;

/*
next() vs nextLine():

Nextline grap entire user input as String

next can get only one word at the same time after it sees space it will not grap rest of them

and conveys to next scanner ref

 */



public class StringInput {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firtName = scanner.next();
        System.out.println("Enter your last name");
        String lastName = scanner.next();

        System.out.println(firtName+" "+lastName);

                ;

    }
}
