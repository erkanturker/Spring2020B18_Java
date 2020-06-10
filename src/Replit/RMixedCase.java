package Replit;

import java.util.Scanner;

public class RMixedCase {
    public static void main (String[] args) {
        Scanner inp = new Scanner ( System.in );
        System.out.print ( "In:" );
        String s = inp.nextLine ();
        //write your code below
        String newWord = "";
        for (int i = 0; i < s.length (); i++) {
            if (i == 0) newWord += s.substring ( i, (i + 1) ).toLowerCase ();
            else if (i % 2 != 0) newWord += s.substring ( i, (i + 1) ).toUpperCase ();
            else newWord += "" + s.substring ( i, (i + 1) ).toLowerCase ();
        }
        System.out.println ( newWord );

    }

    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3)
    {
        if(available || gift == true ||(ingredient1==1&&ingredient2==2&&ingredient3==3 ))return true;
        else if (ingredient1==1&&ingredient2==2&&ingredient3==3 ) return true;
        else if (ingredient1==2&&ingredient2==1&&ingredient3==2 ) return true;
        else if (ingredient1==3&&ingredient2==3&&ingredient3==1 ) return true;
        else return false;

    }
}
