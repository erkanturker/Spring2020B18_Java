package day13_Loop;

public class ReverseStringWithLoop {
    public static void main(String[] args) {
        String str="Erkan Turker";
        String rev="";
        for (int i = str.length()-1; i>=0; i--) {



            System.out.print(str.charAt(i));
        }
        System.out.println("");
        for (int i = str.length()-1; i>=0; i--) {

            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}
