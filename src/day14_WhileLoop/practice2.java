package day14_WhileLoop;
import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        do{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the first number");
            int a= scanner.nextInt();
            System.out.println("Enter the second number");
            int b =scanner.nextInt();
            int result= a+b;
            //scanner.nextLine(); if you use nextLine for the answer vaibalbe we should use this
            System.out.println("Your result is: "+result);
            System.out.println("Do you want to keep continue");
            String answer = scanner.next();
            if(answer.equals("no")){
                break;
            }
           else if (answer.equals("yes")){
                continue;
            }
            else {
                System.out.println("Ivalid entery ");
                System.out.println("Do you want to keep continue");
                break;


            }

        }while (true);
    }
}
