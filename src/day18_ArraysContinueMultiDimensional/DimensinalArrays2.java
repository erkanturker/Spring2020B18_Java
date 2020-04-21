package day18_ArraysContinueMultiDimensional;
import java.util.Arrays;

/*

        2 dimensional array: contains multiple 1 dimensional arrays

            Ex:
             int[][] arr2D = { {1,2} ,{3,4}};

             [index numbers of 1D array] [index numbers of values]

                arr2d[0][1] ==> 2
                arr2d[0] ==> [1,2]

 Arrays.deepToString(VariableName): it's used to convert multi dimentional arrays to String

 */

public class DimensinalArrays2 {
    public static void main(String[] args) {
                        // 0 1    0 1
        int[][] arr2D = { {1,2} ,{3,4}};
                          // 0      1

        System.out.println(arr2D[0][1]);
        System.out.println(Arrays.toString(arr2D[0])); // 1 ,2
        System.out.println(Arrays.toString(arr2D[1])); // 3,4
        System.out.println(Arrays.deepToString(arr2D)); //1,2,3,4

        //3 Dimensional Array contains multiple 2 dimensional arrays

        int [][] array2d= {  {1,2},{3,4} };

        int [][][] arrat3d={  {  {1,2},{3,4} },{  {10,20},{30,40} }  };
                                    //0                1

        //Printing number 4=  0 1 1
        System.out.println(arrat3d[0][1][1]);
        System.out.println(arrat3d[1][1][0]); //30
        System.out.println(Arrays.deepToString(arrat3d)); //whole
    }
}
