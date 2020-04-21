package day12_StringContinue;

import java.sql.SQLOutput;

/*

replace(old char, new char)

replace(old char, new char): replaces all the old chars with the given new char
and returns it as a NEW String vlaueEx:
String str="Java";str = str.replace('a','e');//. str ==> "Jeve"

replace(old str, new str):replace all the old str values
 with the given newstr values in the String and returns it as NEW String
  valueEX:String str2 ="Today is gonna be a great day";str2 =  str2.replace("Today","Tomorrow");
  i//str2 ==> "Tomorrow is gonna be a great day";

  ReplaceFirst(old str, new str):

  ReplaceFirst(old str, new str):it replaces the first occured old str
   with the new str in the String and returns it as a NEW String
   valueEx:String s1 ="Java is fun and great, Java is good";
   s1 = s1.replaceFirst("Java","Python");// s1 ==> "Python is fun and great, Java is good"


 */
public class StringMethod2 {

    public static void main(String[] args) {

        String str ="Erkan Turker";

        System.out.println(str.replace('e','a')); //Erkan Turkar

        String str2 = "Yesterday is a good day. This is greate";

        System.out.println(str2.replace("is","was")); //result esterday was a good day. Thwas was greate


        String str3 = "Java is fun, Java is good  ";

        System.out.println(str3.replaceFirst("Java","C#"));

    }
}
