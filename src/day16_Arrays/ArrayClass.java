package day16_Arrays;

import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
/*
String[] allStudentName ={"Erkan","Zehra","Ekrem","Asim"};

 */
        int [] array =new int[5];
        Scanner scanner =new Scanner(System.in);

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter The "+(i+1) + " number");
            array[i]=scanner.nextInt();

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(" "+array[i]);
        }

    }
}
