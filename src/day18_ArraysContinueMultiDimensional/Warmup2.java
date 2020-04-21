package day18_ArraysContinueMultiDimensional;

/*

Write a program that can print out the unique values from  String Array


 */

public class Warmup2 {
    public static void main(String[] args) {
        String [] array={"Erkan","Erkem","Asim","Asim","Zehra","Zehra"};

        for (int i = 0; i <array.length ; i++) {
            int count=0;
            for (int j = 0; j <array.length ; j++) {

                if(array[i]==array[j]) count++;

            }
            if(count==1) System.out.print(array[i]+" ");
        }
    }
}
