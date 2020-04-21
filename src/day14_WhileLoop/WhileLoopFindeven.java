package day14_WhileLoop;
/*

find even numbers the user will between user will input
intilization
        while(condition){
        statment;
        iterator

 */

import java.util.Scanner;

public class WhileLoopFindeven {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Staring  Number");
        int firstNumber= scanner.nextInt();
        System.out.println("Enter the Ending Number");
        int endingNumber=scanner.nextInt();

        while(firstNumber<=endingNumber){
            if(firstNumber%2==0){
                System.out.print(firstNumber+" ");
            }
            firstNumber++;


        }


    }

}
