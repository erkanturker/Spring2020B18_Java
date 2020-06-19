package Replit;

import java.util.Arrays;

public class findMissingNumber {
    public static void main (String[] args) {
        int [] a = {7, 2, 3, 6, 5, 9, 1, 4, 8};
        System.out.println (missingNumber ( a ));
        int[] a1= populate ( populate(new int[5]) );
        System.out.println (Arrays.toString ( a1 ));
    }

    public static int missingNumber (int[] arr) {
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort ( arr );
        int missing = 0;
        for (int i = 0; i < 9; i++) {
            if (arr[i] != arr2[i]) {
               return missing = arr2[i];
            }

        }
        return 10;
    }
    public static int[] populate(int[] r) {
        for (int i = 0; i <r.length ; i++) {
            r[i]=i+1;
        }
        return r;
    }
    public static boolean badP(int[] products,int limit) {
        int count= 0;
        for (int i = 0; i < products.length; i++) {
            if(products[i]==0) count++;
        }
        return (count>=limit);
    }
}
