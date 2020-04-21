package day12_StringContinue;

import java.util.Scanner;

public class WarmUp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please Enter your First Name");

        String firstName= scanner.nextLine();

        System.out.println(" Please Enter your Last Name");

        String firsLast= scanner.nextLine();

        String fullname= firstName.concat(" "+firsLast);

        //String name="Erkan".concat(12); //Concat methot accept only String value

        int num =fullname.length();

        System.out.println(fullname+" contains "+num+" Characters");

        System.out.println(fullname.charAt(fullname.length()-1));



    }
}
