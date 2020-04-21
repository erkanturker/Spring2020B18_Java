package Replit;

import java.util.Scanner;

public class r035GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        if(item.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 25)+"$");
        }
        else if (item.equals("USB Cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-10)+"$" );
        }
        else if (item.equals("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-30)+"$" );
}

        else if (item.equals("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-50)+"$" );
        }
        else if (item.equals("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-25)+"$" );
        }
        else if (item.equals("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-5)+"$" );
        }
        else if (item.equals("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-60) +"$");
        }
        else if (item.equals("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-40) +"$");
        }
        else if (item.equals("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");

        }
        else if (item.equals("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");

        }
        else {
            System.out.println("Invalid item!");
        }

        //WRITE YOUR CODE HERE
    }

}
