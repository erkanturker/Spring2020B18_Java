package day13_Loop;

import java.util.Scanner;

/*
Write a program thats asks user to enter number 5 times
find the maximum number and the minumum number

 */
public class task04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int biggerNumber=-999999999;
        int smallerNumber=999999999;

        for (int i = 1; i <=5 ; i++) {
            System.out.println(" Enter our number");
            int inputNum=scanner.nextInt();
            if(inputNum>biggerNumber){
                biggerNumber=inputNum;

            }
            if(inputNum<smallerNumber){
                smallerNumber=inputNum;

            }

        }
        System.out.println("Bigger number "+biggerNumber+" Smaller Number"+smallerNumber);

    }
}
