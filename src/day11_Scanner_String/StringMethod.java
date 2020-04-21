package day11_Scanner_String;
/*
charAt(indexnum)
String Methods
it takes the index number and return's its charter as char value
    ex String str = "Erkan"
            str.charAt(4); return N
length();
    return total number of characters as an int value
         String name="Erkan Turker";
        System.out.println(name.length()); return 12
concat(str) it takes a String and concats it to the String variable adn then
return a new string value
String name="Erkan Turker";
        System.out.println(name.length());
        name.concat(" Java Ogreniyor");
        System.out.println(name.concat(" Java Ogreniyor")); //it is brand newErkan Turker Java Ogreniyor
        System.out.println(name); //We will still Erkan Turker becaue String is immutable

 toUpperCase(): converts to Upper Case
 toLowerCase(); converts to lower caes
 */


import java.sql.SQLOutput;

public class StringMethod {
    public static void main(String[] args) {

        String str="Erkan";
        //index number=01234
        System.out.println(str.charAt(4)); //it retruns 5th character
        char chr=str.charAt(4);
        System.out.println(chr);
        //length()
        String name="Erkan Turker";
        System.out.println(name.length());
        name.concat(" Java Ogreniyor");
        System.out.println(name.concat(" Java Ogreniyor")); //it is brand newErkan Turker Java Ogreniyor
        System.out.println(name); //We will still Erkan Turker becaue String is immutable
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        int lenght =name.length();
        int indexnumber =name.length()-1;
        System.out.println("total characters "+lenght+" highest index number "+indexnumber);

    }
}
