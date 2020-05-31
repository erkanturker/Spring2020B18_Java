package Replit;

public class R169MethodswithStringWordCount {
    public static void main (String[] args) {
       int count =  wordCount ( "Erkan Turker" );
        System.out.println (count);
    }


    public static int wordCount(String words) {
        int count=0;

        String[] arr =words.split ( " " );
        for (String each:arr) {
            count++;
        }


        return  count;
    }
}
