package day22_ReturnMethod;

/*
method decleration:
	access-modifier specifier  returnType name(parameter){}
	     public       static     void
 */

public class ReturnMethods {

    public static void main(String[] args) {
        // int x = sum(10,20); we cant assign this because summethod it does not return value
        String a =name(); // This time we can add it because name method return String value

        int sumofTwoNumbers= addition(10,20); //We are able to return it because it return int variable
        System.out.println(sumofTwoNumbers);

    }

    public static void sum(int a, int b){

        System.out.println(a+b);
    }
    public static String name(){

        return "Erkan";
    }
    public static int addition(int a ,int b){
        return a+b;
    }


}
