package day20_CustomMethod;

import java.util.Arrays;

public class VoidwithArgument {
    public static void main(String[] args) {


sumoftwoNumbers(4,5);
oddorEven(10);
RemovceDuplicate("aaaaabbnbnbnaaaasdffccc");




    }

    public static void sumoftwoNumbers(int a, int b){
        System.out.println(a+b);

    }

    public static void oddorEven(int a){
        if (a%2==0) System.out.println(a+" is even number");
        else System.out.println(a+" is event ");

    }

    public static void RemovceDuplicate(String a){
        String newa="";

        for (int i = 0; i <a.length() ; i++) {
            if(!newa.contains(a.substring(i,i+1)))newa+=a.substring(i,i+1);
            
        }

        System.out.print(newa);


    }


}
