package day09_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int number=100;
        //if statement without curly braces the block can only be one statament
        if (number%2==0)System.out.println("Even Number");
        else System.out.println("Odd number");

        //the following way we will apply ternary

        //in ternary ? means the if, : else keyword

        String result = (number%2==0)?"This is even number":"this is odd number";

        System.out.println(result);

        System.out.println("======================");

        int num1 =120;
        int num2 =200;

        int max = (num1>num2)?num1:num2;

        System.out.println(max);

        System.out.println("=================");

        String str="";
        if(true) {
            System.out.println(" hello ");
        }
        else{
            System.out.println("hola");
        }

        System.out.println(str);

        String str2 =(true)?"Hello":"hola";

    }
}
