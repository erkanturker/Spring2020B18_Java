package day12_StringContinue;

/*
username: cybertek.batch12@gmail.com password: Javenger
swrite a program for the login functionality of the email.
- username can be either in uppercase or lowercase-
 Password MUST be as it's- if the user name does not end with "@gmail.com"
 :print "it's not a valid email"- if the username ends with "@gmail.com"
 but username or password does not match:print "invalid username or password"

 */

import java.util.Scanner;

public class warmup4 {
    public static void main(String[] args) {

        String username = "cybertek.batch12@gmail.com";
        String password= "Javenger";
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter Username");
        String sUSername= scanner.nextLine();
        System.out.println("Enter Password");
        String sPassword= scanner.nextLine();
        boolean contains = sUSername.contains("@gmail.com")||sUSername.endsWith("@GMAIL.COM");

        if(!contains){

            System.out.println("Invalid Email address");

        }

        else if(username.equalsIgnoreCase(username)&&password.equals(sPassword)){

            System.out.println("Log in Succesfully");
        }
        else{

            System.out.println("invalid usernmae and password");
        }



    }
}
