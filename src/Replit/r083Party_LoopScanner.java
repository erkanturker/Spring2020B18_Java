package Replit;
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.
 */

import java.util.Scanner;

public class r083Party_LoopScanner {
    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        boolean closeprogram =true;
        System.out.println ("Please enter guest name:");
        String quest = scanner.nextLine ();

       while (closeprogram){
           System.out.println ("Do you want to enter new guest name:");
           String answer = scanner.nextLine ();
           if(answer.equalsIgnoreCase ("yes"  )){
               System.out.println ("Please enter guest name:");
               quest+=", "+scanner.nextLine ();
               continue;

           }
           else{
               System.out.println ("Guest's list: "+quest);
               break;
           }

       }
    }
}
