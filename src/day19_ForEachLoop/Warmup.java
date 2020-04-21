package day19_ForEachLoop;
import java.util.Arrays;

/*
write a program that can check if two Strings are build out of same

	    Ex:
	        if str1 = "aabbbc";  str2 ="cab";
	        output: true

	        if str1 ="abcd";  str2 ="abc";
	        output: false

	    Hint: you will need array and Arrays' methods

 */

public class Warmup {

    public static void main(String[] args) {

        String str1 ="abbbbcd";
        String str2 ="cabd";
        boolean result=true;
        for (int i = 0; i <str1.length() ; i++) {
            int count =0;
            for (int j = 0; j <str2.length() ; j++) {
                    if (str1.charAt(i)==str2.charAt(j)){
                        count++;

                    }
            }
            if(count<=0){
                result=false;
                break;
            }

        }

        System.out.println(result);

    }
}
