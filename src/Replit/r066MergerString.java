package Replit;

public class r066MergerString {
    public static void main(String[] args) {
        String word1="tur";
        String word2="ker";
        String word3="";
        String word="";


        for (int i = 0; i < 3; i++) {

            word3+=""+word1.charAt(i)+word2.charAt(i);

        }
        System.out.println(word3);

        if(word.length()>5){

            System.out.println("Too long!");
        }
        else if(word.length()<5){
            System.out.println("Too short!");

        }
        else{
            for(int i=4; i>=0;i--){

                word1+=""+word.charAt(i);

            }
        }

    }
}
