package day07_IfStatements;

import java.sql.SQLOutput;

public class MediumNumber {
    public static void main(String[] args) {
        double a =100;
        double b=200;
        double c=300;

        boolean aMedium = a<b && a>c || a>b && a<c;
        boolean bMedium = b<c && b>a || b>c  && b<a;
        boolean cMedium = c<b && c>a || c>b && c<a;

        if(aMedium){

            System.out.println(a+" is the medium Number");

        }
        if(bMedium){

            System.out.println(b+" is the medium Number");

        }

        if(cMedium){

            System.out.println(c+" is the medium Number");

        }

    }





}
