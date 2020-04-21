package day18_ArraysContinueMultiDimensional;
/*
toCharArray(): retunrs the STring value as char Array:
                Ex: String str="Java";
                        char[] ch = str.toCharArray();
                    ch -> {'J','a','v','a'}

 */

import java.util.Arrays;

public class ArrayMethod3 {
    public static void main(String[] args) {

        String word="Erkan Turker";
        char[] array =word.toCharArray();
        System.out.println(Arrays.toString(array));

    }
}
