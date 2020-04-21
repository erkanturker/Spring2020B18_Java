package day18_ArraysContinueMultiDimensional;

public class PracticeArrymultidimen {
    public static void main(String[] args) {

        int [][]arr2d={ {1,3},{3,4},{3,8,10}}; // contain multiple 1 dimensional array
        int length = arr2d.length; //2 containg 2 one dimesional arry

        for (int i = 0; i <arr2d.length ; i++) {
            for (int j = 0; j <arr2d[i].length ; j++) {
                System.out.print(arr2d[i][j]+" ");

            }
        }
        System.out.println();

        char [] [] ch32d={  {'E','R'},{'K','A','N'}   };

        for (int i = 0; i <ch32d.length ; i++) {
            for (int j = 0; j < ch32d[i].length; j++) {

                System.out.print(ch32d[i][j]+", ");
            }

        }

    }


}
