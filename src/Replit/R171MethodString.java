package Replit;

public class R171MethodString {
    public static void main (String[] args) {

    }
    public static String limit(String text, int maxLength) {
        String newWord="";
        for (int i = 0; i <maxLength ; i++) {
            newWord+=""+text.charAt ( i );
        }
        return newWord;
    }
}
