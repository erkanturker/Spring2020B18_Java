package day20_CustomMethod;

import java.util.Arrays;

/*
Warmup:
    1. create an int array called numbers that has length of 100
    2. assign 1~100 to the array' indexes
    3. use for each loop to rpint out all the even numbers.
                    must be used contines

 */


public class warmUP {

    public static void main(String[] args) {

        int[] numbers =new int[100];

        for (int i = 1; i <=100 ; i++) {

            numbers[i-1]=i;
        }

        for (int each: numbers){
            if(each%2!=0){
                continue;
            }
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));

    }
}
