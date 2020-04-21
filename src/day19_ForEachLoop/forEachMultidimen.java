package day19_ForEachLoop;

import java.util.Arrays;

public class forEachMultidimen {
    public static void main(String[] args) {
        int[] [] arr2d={{1,2,3,4},{5,6,7}};

        for (int i = 0; i <arr2d.length ; i++) {
            for (int j = 0; j <arr2d[i].length ; j++) {
                System.out.print(arr2d[i][j]);
            }

        }
        System.out.println();
        for(int[] each1:arr2d){
            for(int each2: each1){
                System.out.print(each2+" ");
            }
        }
        System.out.println();

        String[][] str2D={{"Bibish","Syfo"},{"Syfoo","Julia"}};

        for (String[] each1: str2D) {

            for(String each2: each1){
                System.out.print(each2+" ");
            }

        }
        System.out.println();
        System.out.println(Arrays.deepToString(str2D));


    }
}
