package day18_ArraysContinueMultiDimensional;
/*
split(str):  splits the String by given value and returns it as String array:
                Ex:
                    String words ="Java is fun";
                    String[] arr = words.split(" ");
                    arr -> {"java", "is","fun"}

 */

import java.util.Arrays;

public class ArrayMethod2 {

    public static void main(String[] args) {
        String sentence ="Today is great day Good day to learn Java ";
        String [] array=sentence.split(" ");
        System.out.println("The sentence variable has "+ array.length+" words");
        System.out.println(Arrays.toString(array));

        //find how many time java word occured in the following sentenmce
        String java = "I love java and java is fun java is good";
        String[] arr2 =java.split("java");
        System.out.println(arr2.length-1);
        System.out.println(Arrays.toString(arr2));

        String Python =" Python is good, I love Python, Python is life";
        String[] arr3 = Python.split("Python");
        System.out.println(arr3.length-1);

        String email = "Cybertek.school.batch12@gmai.com";
        String fullname= email.substring(0,email.indexOf("@"));
        System.out.println(fullname);
        String [] Allnames= fullname.split("\\.");
        System.out.println("name "+Allnames[0]);
        System.out.println(Arrays.toString(Allnames));

        String word = "Erkan";
        String[]   arr4 =    word.split(""); //splits chracter by characters
        System.out.println(Arrays.toString(arr4));

        //




    }
}
