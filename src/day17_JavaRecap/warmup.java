package day17_JavaRecap;
/*
   1. write a program that can return the maximum value from an int array
   2. write a program that can return the second maximum value from an int array
   3. write a program that return the minimum value from an int array
   4. write a program that return the second minimum valye from an int array

    */
public class warmup {

    public static void main(String[] args) {

        int[] array= {20,200,40,50,500};
        int maxNumber=0;
        int smaxNumber=0;
        int minNumber=99999999;
        int sminNumber=9999999;

        int z =5;
        for (int i=5; i>0; i--){
            System.out.print(i);
        }
        System.out.println(z);

        for (int i = 0; i <array.length ; i++) {

            if (array[i]>maxNumber){
                maxNumber=array[i];
            }

        }

        for (int i = 0; i <array.length ; i++) {

            if(array[i]>smaxNumber && array[i]<maxNumber){
                smaxNumber=array[i];
            }

        }
        for (int i = 0; i <array.length ; i++) {

            if (array[i]<minNumber){
                minNumber=array[i];
            }

        }

        for (int i = 0; i <array.length ; i++) {

            if(array[i]<sminNumber && array[i]>minNumber){
                sminNumber=array[i];
            }

        }

        System.out.println("This is the max Number: "+maxNumber);
        System.out.println("\"This is the Second max Number:"+smaxNumber);
        System.out.println("This is the min Number: "+minNumber);
        System.out.println("\"This is the Second min Number:"+sminNumber);
    }



}
