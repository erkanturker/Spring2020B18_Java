package Replit;

import java.util.Scanner;

public class R149AddtoArray {
    public static void add_to_r(int[] r,int n)
    {
        int[] newArr = new int[r.length+1];
        for (int i = 0; i < r.length; i++) {
            newArr[i] = r[i];
        }

        newArr[newArr.length-1]=n;
        for (int each:
             newArr) {
            System.out.print (each);
        }



    }

    public static void main(String[] args) {


        Scanner inp = new Scanner (System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);


    }
}
