package day16_Arrays;

public class CombiningArrays {
    public static void main(String[] args) {
        int [] array1= {1,2,3,4};
        int [] array2= {5,6,7};

        int [] array3= new int[array1.length+array2.length];

        for (int i = 0; i <array1.length ; i++) {

            array3[i]=array1[i];

        }
        for (int i = 0; i <array2.length ; i++) {

            array3[(array1.length)+i]=array2[i];

        }

        for (int i = 0; i <array3.length ; i++) {

            System.out.print(array3[i]);
        }

    }
}
