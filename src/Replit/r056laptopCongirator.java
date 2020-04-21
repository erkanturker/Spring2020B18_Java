package Replit;
import java.util.*;
public class r056laptopCongirator {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Select screen size:");
        screenType=scan.nextLine();
        if(screenType.equals("13.3")){
            price+=200;
        }
        else if(screenType.equals("15.0")){
            price+=300;
        }
        else if(screenType.equals("17.3")){
            price+=400;
        }
        System.out.println("Select CPU type:"+price);
        cpu=scan.nextLine();
        if(cpu.equals("i3")){
            price+=150;
        }
        else if(cpu.equals("i5")){
            price+=250;
        }
        else if(cpu.equals("i7")){
            price+=350;
        }
        System.out.println("Select RAM size:"+price);
        ram=scan.nextInt();
        scan.nextLine();
        price+=50*(ram/4);

        System.out.println("Select storage type:"+price);
        storageType=scan.nextLine();
        if(storageType.equals("HDD")){
            System.out.println("Enter memory size:");
            int storesize=scan.nextInt();
            scan.nextLine();
            price+=50*(storesize/500);
        }
        else if(storageType.equals("SSD")){
            System.out.println("Enter memory size::");
            int  storesize=scan.nextInt();
            scan.nextLine();
            price+=100*(storesize/500);

        }
        System.out.println("Enter screen resolution:"+price);
        screenType=scan.nextLine();
        if(screenType.equals("FULLHD")){
            price+=100;
        }
        else if(screenType.equals("4K")){
            price+=200;
        }
        System.out.println("Laptop price is: "+price);


    }
}
