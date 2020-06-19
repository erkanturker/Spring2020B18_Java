package Replit;

import java.util.Scanner;

public class RConditinalStatement {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        String lastString= ""+word.charAt ( word.length ()-1 );
        String last2String=word.substring (word.length ()-2 );
        String last3String=word.substring ( word.length ()-3 );


        if(lastString.equals ( "y" )&&!last2String.equals ( "ey" )) System.out.println ("-ies");
        else if (last2String.equals ( "ey" )) System.out.println ("-eys");
        else if (last3String.equals ( "ife" )) System.out.println ("-ives");
        else System.out.println ("-s");



    }
}
