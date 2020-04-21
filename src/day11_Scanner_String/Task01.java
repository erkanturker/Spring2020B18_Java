package day11_Scanner_String;

import java.util.Scanner;

public class Task01 {

    /*

    Write program that ask user 3 numbers
    returns largest numbers
    do it with ternary
     */

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the fiRst number");
        int num1=scanner.nextInt();
        System.out.println("Enter the fist number");
        int num2=scanner.nextInt();
        System.out.println("Enter the fist number");
        int num3=scanner.nextInt();

        int largestNum=(num1>num2&&num1>num3)?num1:(num2>num1&&num2>num3)?num2:num3;

        System.out.println("Largest number "+largestNum);

    }
}
