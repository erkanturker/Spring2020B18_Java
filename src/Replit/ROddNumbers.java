package Replit;

import java.util.Scanner;

public class ROddNumbers {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();
        //start on line 11
        String oddNumber="";
        for (int i = num1; i <=num2; i++) {
            if (i%2!=0)  oddNumber+=""+i+" ";
        }
        oddNumber= oddNumber.trim ();
        System.out.println (oddNumber);
    }
}
