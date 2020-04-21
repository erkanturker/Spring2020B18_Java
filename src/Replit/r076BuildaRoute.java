package Replit;
import java.util.Scanner;
public class r076BuildaRoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        String word = "ABCD";
        String direction="";
        if(word.indexOf(start)==word.indexOf(end) ){
            System.out.println(start+" found");

        }
        else if(word.indexOf(start)<word.indexOf(end)){
                 for (int i = word.indexOf(start); i <word.indexOf(end) ; i++) {

            if (word.substring(i, i + 1).equals("A")) direction += "right >";
            if (word.substring(i, i + 1).equals("B")) direction += "down >";
            if (word.substring(i, i + 1).equals("C")) direction += "left >";
            if (word.substring(i, i + 1).equals("D")) direction += "up >";

        }
            System.out.println(direction.substring(0,direction.length()-1).trim()+":"+end+" found");
        }
        else if(word.indexOf(start)>word.indexOf(end)){

            word+="ABCD";
            for (int i = word.indexOf(start); i <word.lastIndexOf(end) ; i++) {

                if (word.substring(i, i + 1).equals("A")) direction += "right >";
                if (word.substring(i, i + 1).equals("B")) direction += "down >";
                if (word.substring(i, i + 1).equals("C")) direction += "left >";
                if (word.substring(i, i + 1).equals("D")) direction += "up >";
            }

            System.out.println(direction.substring(0,direction.length()-1).trim()+":"+end+" found");

        }



        }

    }

