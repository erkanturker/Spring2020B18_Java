package Replit;

import java.util.Scanner;

import java.util.Scanner;

public class R022ShoppinglistI_Scanner {
    public static void main(String[] args) {
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        item1 =scanner.nextLine();
        price1=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Item2 and its price:");
        item2 =scanner.nextLine();
        price2=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Item3 and its price:");
        item3 =scanner.nextLine();
        price3=scanner.nextDouble();
        scanner.nextLine();

        System.out.println();

        report="Item1:"+item1+" Price:"+price1+"Item2:"+item2+" Price:"+price2+"Item3:"+item3+" Price:"+price3;
        totalPrice=(price1)+(price2)+(price3);
        System.out.println("Total price: "+totalPrice);
        System.out.println(report);






    }
}
