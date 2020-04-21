package day22_ReturnMethod;

/*
1.writen method that can return largest number amaoung 3 numbers
2. write method accept accept array and return max number
3. Write a method that can accpet String array and return longest string

 */


import java.util.Arrays;

public class ReturnMaxNumber {
    public static void main(String[] args) {
        int arr[] = {100,200,4,500,1000,1};
        System.out.println(LargerNumber(10,500,40));
        System.out.println(Maxnumber(arr));
        String [] arr2= {"Erkan","GulsenZehra","Asim","Ekrem"};
        System.out.println(LongesWord(arr2));
        System.out.println(Arrays.toString(SortArray(arr)));

    }

    public static int LargerNumber(int a ,int b,int c){
        int[] arr ={a,b,c};
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int LargerNumber(double a ,double b,double c){
        double[] arr ={a,b,c};
        Arrays.sort(arr);
        return (int) arr[arr.length-1];
    }

    public static int Maxnumber(int[] arr){
        Arrays.sort(arr);
        int x=arr[arr.length-1];
        return x;
    }
    public static String LongesWord(String[] arr){
        String word="";
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length()>word.length()){
                word=arr[i];
            }
        }
        return word;
    }
    // Write a method accepts int array sort the array it the retrins an array
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
}
