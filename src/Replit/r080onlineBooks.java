package Replit;

import java.util.Scanner;

public class r080onlineBooks {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        if (isPremiumCustomer==true) {
            if(nbooksPurchased>5 && nbooksPurchased<8){
                freeBooks+=1;
            }
            else if(nbooksPurchased>=8){
                freeBooks+=2;
            }



        }
        else {
            if(nbooksPurchased>7 && nbooksPurchased<12){
                freeBooks+=1;
            }
            else if(nbooksPurchased>=12){
                freeBooks+=2;
            }




        }
        System.out.println(freeBooks);
    }
}