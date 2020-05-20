package Replit;

import java.util.Scanner;

public class R139Mehod1SimpleCalc {
    public static void main(String[] args) {

        plus();
    }

    public static void plus(){

        //your code here
        Scanner scanner = new Scanner ( System.in );

        int firstnumber= scanner.nextInt ();

        int secondNumber =scanner.nextInt ();
        System.out.println ("result: "+(firstnumber+secondNumber));
    }
    public static void cube(){
        Scanner scanner = new Scanner ( System.in );
        int cube= scanner.nextInt ();
        System.out.println (cube*cube*cube);
        System.out.println ("Hello");
    }
}
