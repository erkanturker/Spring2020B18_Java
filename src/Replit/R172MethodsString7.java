package Replit;
/*
at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"

 */


public class R172MethodsString7 {
    public static void main (String[] args) {
        String a = at3 ( "Asim", "Ekrem" );
        System.out.println ( a );
    }

    public static String at3 (String target, String word) {
        String newWord = "";
        newWord += target.substring ( 0, 3 );
        newWord += "" + word + "" + target.substring ( 3 );
        return newWord;
    }

    public static String biggerS (String a, String b) {
        return (a.length () > b.length () ? a : b);
    }

    public static String removeFirst (String target) {
        return target.substring ( 1 );
    }

    public static int findMax (int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static double findMax (double[] arr) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
