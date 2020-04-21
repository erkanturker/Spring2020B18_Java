package Replit;
import java.util.Scanner;
public class r069StringHalfprint {




        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            String email="erkan_turker@gmail.com";
            String newemail="";
            String a="er";
            //WRITE YOUR CODE HERE

            int halfindex=word.length()/2;

            System.out.println(word.substring(0,halfindex)+""+word.substring(0,halfindex));

            if(a.contains("_")){

                newemail+=a.substring(a.indexOf("_")+1,a.indexOf("@"));
                newemail+="_"+a.substring(0,a.indexOf("_"))+"@gmail.com";


            }
            System.out.println("First name: "+email.substring(0,1).toUpperCase()+email.substring(1));
            if (word.contains("x") || word.contains("X")){


                word=(word.replaceFirst("X",""));

            }
            System.out.println(word);
        }
    }

