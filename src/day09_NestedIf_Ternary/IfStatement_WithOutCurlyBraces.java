package day09_NestedIf_Ternary;

public class IfStatement_WithOutCurlyBraces {

    public static void main(String[] args) {

        int number =100;
        //if statement without curly braces the block can only be one statament
        if (number%2==0)System.out.println("Even Number");
        else System.out.println("Odd number");

        if(9>8) // if you stataemnt like this if statment get only first one
                // rest of them will print allways
            System.out.println("Hello");
            System.out.println("Contition is true");
            System.out.println("");




    }
}
