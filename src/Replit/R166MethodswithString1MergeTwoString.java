package Replit;

public class R166MethodswithString1MergeTwoString {
    public static void main (String[] args) {
        System.out.println ( mergeStrings ( "java", "SELENIUM" ) );
        System.out.println (uniqueChars ( "write your below" ));
    }

    public static String mergeStrings (String one, String two) {
        String newWord = "";

        int index = (one.length () > two.length ()) ? two.length () : one.length ();

        for (int i = 0; i < index; i++) {

            newWord += "" + one.charAt ( i ) + "" + two.charAt ( i );

        }
        if (one.length () < two.length ()) {
            for (int i = one.length (); i < two.length (); i++) {
                newWord += "" + two.charAt ( i );
            }

        } else if (two.length () < one.length ()) {
            for (int i = two.length (); i < one.length (); i++) {
                newWord += "" + one.charAt ( i );
            }
        }

        return newWord;
    }

    public static String uniqueChars (String str) {
        //TODO: write your below
        String newWord = "";
        for (int i = 0; i <str.length () ; i++) {
            if(!newWord.contains ( ""+str.charAt ( i ) )){
                newWord+=""+str.charAt ( i );
            }
        }

        return newWord;
    }
}
