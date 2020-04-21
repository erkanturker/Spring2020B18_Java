package Replit;

/*

Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
Declare 2 int variables: age, zipcode
Declare 2 double variables: height, weight.
Declare boolean variable: isMarried (for marriage status).
Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

 */

import java.util.Scanner;

public class R024PatientInformation {

    public static void main(String[] args) {
        String firstName, lastName, fullName, email, street, state, city, address, contacts;
        int age, zipcode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber,personalPhoneNumber;
        Scanner scanner =new Scanner(System.in);



        //-Display prompt "Are you married?"
        //true



        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName=scanner.nextLine();
        System.out.println("Enter your last name");
        lastName=scanner.nextLine();
        System.out.println("Enter your email");
        email=scanner.nextLine();
        System.out.println("Enter your street");
        street=scanner.nextLine();
        System.out.println("Enter your city");
        city=scanner.nextLine();
        System.out.println("Enter your state");
        state=scanner.nextLine();
        System.out.println("Enter your zip code");
        zipcode=scanner.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber=scanner.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber=scanner.nextLong();
        System.out.println("Enter your age");
        age=scanner.nextInt();
        System.out.println("Enter your height");
        height=scanner.nextDouble();
        System.out.println("Enter your weight");
        weight=scanner.nextDouble();
        System.out.println("Are you married?");
        isMarried=scanner.nextBoolean();

        contacts="Contacts: work phone number -  "+workPhoneNumber+", personal phone number - "+personalPhoneNumber
        +" ,  email: "+email;
        fullName=lastName+", "+firstName;

        address=street+", "+city+", "+state+" "+zipcode;

        String others= "Age: "+age+"\nHeight: "+height+"\nWeight: "+weight+"\nMarried?: "+isMarried;

        System.out.println("Patient personal information"+"\nFull name:"+fullName+
                "\nAddress: "+address+"\nContacts: "+contacts+"\n"+others);





    }

}
