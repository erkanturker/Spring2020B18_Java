package Replit;

import java.util.Scanner;

public class R154MethodsCheckPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        /* WRITE YOUR CODE HERE */
        String number= ""+num;
        String newNumber="";

        for (int i = number.length ()-1; i >=0 ; i--) {
                newNumber+=""+number.charAt ( i );
        }
        if(number.equals ( newNumber )) System.out.println ("true");
        else System.out.println ("false");



    }
}
