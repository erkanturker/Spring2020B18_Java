package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R170StringBadWord {
    public static void main (String[] args) {
        // System.out.println ( isPalindrome ( "is palindrom" ) );
        System.out.println ( isAnagram ( "iock", "kioc" ) );
        System.out.println (calc.minus ( 1,2 ));
        System.out.println (calc.coverString ( "erkan","m" ));
        String [] arr ={"apple", "pear"};
        String [] arr1 =calc.reverse ( arr );
        System.out.println (Arrays.toString ( arr1 ));

    }

    public static String clean (String text, String badWord) {
        return text.replace ( badWord, "" );
    }

    public static Boolean isPalindrome (String check) {
        check = check.replace ( " ", "" );
        String newWord = "";
        for (int i = check.length () - 1; i >= 0; i--) {
            newWord += "" + check.charAt ( i );
        }
        return (check.equalsIgnoreCase ( newWord ) ? true : false);
    }

    public static String extractNum (String s) {
        String number = "";
        for (int i = 0; i < s.length (); i++) {
            if (Character.isDigit ( s.charAt ( i ) )) number += "" + s.charAt ( i );
        }
        return number;
    }

    public static boolean isAnagram1 (String word1, String word2) {
        word1= word1.replace ( " ", "" );
        word2= word2.replace ( " ", "" );
        word1 = word1.toLowerCase ();
        word2 = word2.toLowerCase ();
        String[] a = word1.split ( "" );
        String[] b = word2.split ( "" );
        Arrays.sort ( a );
        Arrays.sort ( b );
        word1 = Arrays.toString ( a );
        word2 = Arrays.toString ( b );
        return word1.equalsIgnoreCase ( word2 );
    }

    public static boolean isAnagram (String word1, String word2) {
        word1 = word1.toLowerCase ();
        word2 = word2.toLowerCase ();
        if (word1.length () != word2.length ()) return false;
        for (int i = 0; i < word1.length (); i++) {
            if (word1.contains ( "" + word2.charAt ( i ) ) && word2.contains ( "" + word1.charAt ( i ) )) return true;
            else return false;
        }
        return false;
    }


}
class calc{
    public static int plus(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static String coverString(String main, String coverME) {
        String newWord= "";
         main= main.replace ( coverME,"["+coverME+"]" );
         if(!main.contains ( coverME )){
             main= "["+main+"]";
         }

    return main;
    }
    public static String[] reverse(String[] arr) {
        String [] newArr = new String[arr.length];
        int z=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            newArr[z]=arr[i];
            z++;
        }
        return newArr;
    }
}


