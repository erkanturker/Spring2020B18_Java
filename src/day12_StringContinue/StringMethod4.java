package day12_StringContinue;

/*

contain(str) Checks if the str is contained in the Stringor not
then retruns boolean expression
contained true not false

statWith (str) checks if the String is stared with the str or not
then return boolean expression
startedWith true   not false

endwith(str) che



 */

public class StringMethod4 {

    public static void main(String[] args) {
        String name="Erkan Turker";
        boolean result= name.contains("ABC");
        System.out.println(result);
        String name2 ="Ekrem Asim";
        System.out.println(name2.contains("s"));// true
        String todaysClass="Java";
        boolean result2 = todaysClass.startsWith("J");
        System.out.println(result2); ///
        String names="Cybertek School is a great school to learn Java";
        System.out.println(names.startsWith("Cybertek School"));
        System.out.println(names.endsWith("a")+" endWith Method");//true
        System.out.println(names.endsWith("av")+" endWith Method");//fasle
        System.out.println(names.endsWith("ava")+" endWith Method");//true
        System.out.println(names.endsWith("Java")+" endWith Method");//true
        System.out.println(names.endsWith("avaJ")+" endWith Method");//false
    }
}
