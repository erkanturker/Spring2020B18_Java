package day22_ReturnMethod;

import java.util.Arrays;

public class OverloadMethod {

    public static void main(String[] args) {
        char [] array= {'a','c','x','b'};
        int [] array2= {5,2,10,20};
        int [] arr3 = SortArray(array2);
        char [] arr2 =SortArray(array);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

    public static int[] SortArray(int [] arr){
        int arr2[] =new int[arr.length];
        Arrays.sort(arr);
        int z=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            arr2[z]=arr[i];
            z++;
        }
        return arr2;
    }

    public static char[] SortArray(char [] arr){
        char arr2[] =new char[arr.length];
        Arrays.sort(arr);
        int z=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            arr2[z]=arr[i];
            z++;
        }
        return arr2;
    }
}
