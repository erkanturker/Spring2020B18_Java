package Replit;

import java.util.Scanner;
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */

public class R097Equalsjavapython_LoopString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int totalJava= 0;
        int totalPhyton=0;
        boolean result;
        for (int i = 0; i <sentence.length ()-3 ; i++) {
            if(sentence.substring ( i,i+4 ).equals ( "java" )){
                totalJava++;
            }
        }
        for (int i = 0; i <sentence.length ()-5 ; i++) {
            if(sentence.substring ( i,i+6 ).equals ( "python" )){
                totalPhyton++;
            }
        }
        if(totalJava==totalPhyton){
            result=true;
            System.out.println (result);
        }
        else{
        result=false;
        System.out.println (result);}



    }

}
