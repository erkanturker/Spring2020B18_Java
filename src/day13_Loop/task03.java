package day13_Loop;

/*
Write a program thats asks user to enter number 5 times
1. find the sum fo those 5 inputs
2. find the maximum number and the minumum number

 */

import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for (int i = 1; i <=5 ; i++) {
            System.out.println(" Enter our number");
            int inputNum=scanner.nextInt();
            sum+=inputNum;
        }
        System.out.println("sum is "+sum);




    }
}
