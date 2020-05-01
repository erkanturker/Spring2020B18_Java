package Replit;
/*
extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23

extractNum("aa2") ==> 2

extractNum("aa10aa") ==> 10

extractNum("aa!!%$#.10aa") ==> 10

 */

public class r12ExtractNumberFromString {
    public static void main (String[] args) {
        System.out.println ( extractNum ( "erkan1234" ));
    }

    public static String extractNum(String s) {
        String numbers="0123456789";
        String newWord="";
        for (int i = 0; i <s.length () ; i++) {
            if(numbers.contains ( ""+s.charAt ( i ) )){
                newWord+=s.charAt ( i );
            }

        }
    return newWord;
    }
}
