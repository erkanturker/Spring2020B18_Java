package day12_StringContinue;

/*
trim()
trim(): removes the unused spaces and returns it as a NEW string valueEx:
String str = "    Cybertek   ";str = str.trim();  ==> str="Cybertek";

substring(beginning index)

substring(beginning index): it creates subString of the String value from the beginning index
 till the last index and returns it as new String value.Ex:
Ex: String str = "Cybertek";//  index num:    01234567str = str.substring(3); ==> "ertek"

substring(beginning index, ending index):

substring(beginning index, ending index): it creates subString of the String value
 from the beginning index till the ending index that are provided and returns it as new String value.ENDING INDEX WILL BE EXCLUDEDEx:
String str = "Cybertek";//  index num:    012345str = str.substring(0, 5);
 */

public class StringMethods {
    public static void main(String[] args) {

        String trimExample="   Erkan    Turker"; // if the space between workds it not gointo trip
        System.out.println(trimExample.trim()); // result is  it will deltete first spaces but  spaces
        // it will not delete the spaces between Erkan and Turker

        String str = "Ekrem Turker";
        System.out.println(str.substring(6));

        String str2= "Mr.Erkan Turker Great Job"; //
        System.out.println(str2.substring(3,15)); //Result is Erkan Turker

    }
}
