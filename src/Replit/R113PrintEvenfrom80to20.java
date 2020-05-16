package Replit;

public class R113PrintEvenfrom80to20 {
    public static void main (String[] args) {
        int count =0;
        String result="";
        for (int i = 80; i>=0 ; i--) {
            if(i%2==0){
                result=""+i+" ";
            }
        }
        System.out.println (result.trim ());


    }
}
