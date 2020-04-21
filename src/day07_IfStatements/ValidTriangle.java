package day07_IfStatements;

/*
1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not.
 */

public class ValidTriangle {
    public static void main(String[] args) {
        double angle1 = 30.5;
        double angle2= 50;
        double angle3=60;

        short sumOfAngle=(short)(angle1+angle2+angle3);
        boolean validTriangle=sumOfAngle==180;

        if(validTriangle){

            System.out.println("This is a valid Triangle");
        }

        if(!validTriangle){

            System.out.println("This is NOT a valid Triangle");
        }

    }
}
