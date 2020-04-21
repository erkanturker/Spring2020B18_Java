package day15_NestedLoop;
import java.util.Scanner;
public class solvingPractice2problem {
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

            while (!(answer.equals("yes")||answer.equals("no")) ){

                System.out.println("Ivalid entery ");
                System.out.println("Do you want to keep continue");
                answer=scanner.next();
            }

            if(answer.equals("no")){
                break;
            }
           if (answer.equals("yes")){
                continue;
            }



        }while (true);

    }

}
