package day20_CustomMethod;

import java.util.Arrays;

public class VoidMethod {

    public static void main(String[] args) {

        evenonetohundred();


    }

    public static void evenonetohundred(){

        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
