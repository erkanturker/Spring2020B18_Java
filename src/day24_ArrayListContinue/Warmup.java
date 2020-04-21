package day24_ArrayListContinue;

import java.util.Arrays;

public class Warmup {
    public static void main(String[] args) {

        int [] arr = {10,4,5,6,23,45};
        int []arr2= returnDesOrder(arr);
        System.out.println(Arrays.toString(arr2));

        char [] chrarr = {'X','F','L','N'};
        char [] chrarr2= returnDesOrder(chrarr);
        System.out.println(Arrays.toString(chrarr2));



    }


    public static int[] returnDesOrder(int[] arr){
        Arrays.sort(arr);
        int z =0;
        int[] arr2 =new int[arr.length];
        for (int i = arr.length-1; i>=0 ; i--) {
            arr2[z]=arr[i];
            z++;

        }
        return arr2;
    }
    public static char[] returnDesOrder(char[] arr){
        Arrays.sort(arr);
        int z =0;
        char[] arr2 =new char[arr.length];
        for (int i = arr.length-1; i>=0 ; i--) {
            arr2[z]=arr[i];
            z++;

        }
        return arr2;
    }
    public static String[] returnDesOrder(String[] arr){
        Arrays.sort(arr);
        int z =0;
        String[] arr2 =new String[arr.length];
        for (int i = arr.length-1; i>=0 ; i--) {
            arr2[z]=arr[i];
            z++;

        }
        return arr2;
    }

    public static double[] returnDesOrder(double[] arr){
        Arrays.sort(arr);
        int z =0;
        double[] arr2 =new double[arr.length];
        for (int i = arr.length-1; i>=0 ; i--) {
            arr2[z]=arr[i];
            z++;

        }
        return arr2;
    }
}
