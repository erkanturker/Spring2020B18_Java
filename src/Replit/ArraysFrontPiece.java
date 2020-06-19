package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFrontPiece {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }

        if(size>1){
            int[] arr = {num[0],num[1]};
            System.out.println ( Arrays.toString (arr));
        }
        else{
            int[] arr = {num[0]};
            System.out.println ( Arrays.toString (arr));
        }




    }
}
