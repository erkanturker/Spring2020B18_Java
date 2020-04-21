package day19_ForEachLoop;

public class ContinueStatement {

    public static void main(String[] args) {
        System.out.println(5/2);
        String word ="Erkan";

        if(word.length()>=3 && word.length()%2!=0 ){

            System.out.println(word.charAt(word.length()/2));

        }
        else if(word.length()>=3 && word.length()%2==0 ){

            System.out.println(word.substring(word.length()/2,(word.length()/2)+2));


        }
        else if (word.length()==2){

            System.out.println(word.concat(word));
        }
        else{

            System.out.println(word.concat(word.concat(word)));
        }



    }
}
