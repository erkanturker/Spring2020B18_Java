package day17_JavaRecap;


import java.util.Scanner;

/*
ask user enter five numbers then find the sum of

 */
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array=new int[5];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1+". number");
            array[i]=scanner.nextInt();
            sum+=array[i];

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("your sum is "+sum);

    }



}
