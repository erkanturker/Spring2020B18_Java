package Replit;

import java.util.Scanner;

public class R100ArraysPrinting01_LoopArrays {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!
        for (int i = 0; i <5 ; i++) {
            if(arr[i].length ()>3){
                System.out.println (arr[i].substring ( 0,3));
            }
            else System.out.println (arr[i]);
        }




    }
}
