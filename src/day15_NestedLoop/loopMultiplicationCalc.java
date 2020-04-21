package day15_NestedLoop;
import java.util.Scanner;
public class loopMultiplicationCalc {
    public static void main(String[] args) {


        while (true){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println("Your multiplication is: "+(a*b));
            System.out.println("Do you want to continue 'Yes' or 'No'");
            scanner.nextLine();
            String answer = scanner.nextLine();

            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no")) ){
                System.out.println("Invalid Entery");
                System.out.println("Do you want to continue 'Yes' or 'No'");
                answer=scanner.nextLine();

            }
            if (answer.equalsIgnoreCase("no")){
                break;
            }


        }







    }

}
