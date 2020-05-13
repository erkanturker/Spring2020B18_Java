package Replit;

import java.util.Scanner;

public class R095GetSandwich {
    public static void main (String[] args) {
        Scanner scan = new Scanner ( System.in );
        String str = scan.next ();
        System.out.println (str.indexOf ( "bread" ));
        System.out.println (str.lastIndexOf ( "bread" ));
        if(str.indexOf ( "bread" )!=-1){
            if (str.indexOf ( "bread" )!=str.lastIndexOf ( "bread" )){
               str=  str.substring ( str.indexOf ("bread")+5,str.lastIndexOf ( "bread" ) );
                System.out.println (str);
            }
            else System.out.println ("nothing");

        }
        else System.out.println ("nothing");

    }
}
