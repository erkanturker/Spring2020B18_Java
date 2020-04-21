package day18_ArraysContinueMultiDimensional;
/*
Write a program that can print out the unique values from an int Array
Ex:if arr -> {1,1,2,3,3
}output: 2
if arr -> {1,2,2,3,4,4}
output:  1  3

 */

public class Warmup {
    public static void main(String[] args) {
        String str ="";

        int[] array = {1,1,3,4,5,5,6,7,7};

        for (int i = 0; i <array.length ; i++) {
            int count=0; //Each time (for each array) we need to restart (make it 0 ) That's way we declare here
                        // if we declare out side with this condition count will be 2 it is not equal 1 and not going to restart either and dont show as anything and stuck

            for (int j = 0; j <array.length ; j++) {

                if(array[i]==array[j]){

                   count++;                   // Basically inner loop finding occurence number if it is more than one we will not show
                }

            }
            if (count==1){ //if the array occured 1 one time other wise do not work

                str+=""+array[i];
            }


        }
        System.out.println(str);

    }
}
