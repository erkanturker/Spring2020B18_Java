package Replit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class r087hasjavaString {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.length()<4){
            System.out.println();
            exists=false;
            System.out.println(false);
        }

       else if( word.substring(0,4).equals("java")){
            exists=true;
            System.out.println(exists);
        }
       else if(word.substring(1,5).equals("java")){
            exists=true;
            System.out.println(exists);
        }
       else{
           exists=false;
            System.out.println(exists);
        }


        }
}
