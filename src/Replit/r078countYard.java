package Replit;

import java.util.Scanner;

/*
Ray
Yes
20910
Owned
Business
45
10
Yes
1
Yes
Bachelors
 */

public class r078countYard {
    public static void main(String[] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        name=scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String licence=scan.nextLine();
        if (licence.equalsIgnoreCase("yes")){

            System.out.println("Enter your zip code");
            int zipcode = scan.nextInt();
            scan.nextLine();
            if(zipcode==20910 || zipcode==20740) premium+=60;
            else if (zipcode==22102 || zipcode==22103)premium+=30;
            else premium+=50;

            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            vehicleOwnership=scan.nextLine();
            if(vehicleOwnership.equalsIgnoreCase("owned"))premium+=10;
            else premium+=20;

            System.out.println("How is this vehicle primarily used?");
            vehicleUsage=scan.nextLine();

            if(vehicleUsage.equalsIgnoreCase("Commute")){
                premium+=20;
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool=scan.nextInt();
                if(daysDrivenToWorkOrSchool>30){
                    System.out.println("Invalid data!");
                    System.exit(0);
                }
                premium+=5*daysDrivenToWorkOrSchool;
                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool=scan.nextInt();
                premium+=1*milesToWorkOrSchool;

            }
            else if(vehicleUsage.equalsIgnoreCase("Business")){
                premium+=50;
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool=scan.nextInt();
                if(daysDrivenToWorkOrSchool>30){
                    System.out.println("Invalid data!");
                    System.exit(0);
                }
                premium+=5*daysDrivenToWorkOrSchool;
                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool=scan.nextInt();
                premium+=1*milesToWorkOrSchool;
            }
            else if (vehicleUsage.equalsIgnoreCase("Pleasure")) premium+=10;



            System.out.println("How old are you?");
            int age =scan.nextInt();
            scan.nextLine();
            if(age<16){
                System.out.println("Invalid data!");
                System.exit(0);
            }
            else if(age>=16 && age<18)premium*=20;
            else if(age>=18 && age<21)premium*=6;
            else if(age>=21 && age<25)premium*=2;

            System.out.println("How many years you've been driving?");
            int drv = scan.nextInt();
            scan.nextLine();
            if(drv<0||(age-drv)<16){
                System.out.println("Invalid data!");
                System.exit(0);
            }
            else premium-=drv*drv;

            System.out.println("Have you had any accidents in the last 5 years?");
            String answerAcc=scan.nextLine();
            if(answerAcc.equalsIgnoreCase("yes")) {
                System.out.println("How many?");
                accidentsAmount = scan.nextInt();
                for (int i = 1; i <= accidentsAmount; i++) premium += ((premium * 20) / 100);
            }
            System.out.println("Have you had continuous insurance for the past 12 months?");
            continuousInsurance=scan.nextLine();
            if(continuousInsurance.equalsIgnoreCase("No")) premium += premium * 2;

            System.out.println("What is the highest level of education you have completed?");
            education=scan.nextLine();
            if(education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters")){
                premium -= ((premium * 5) / 100);
            }
            else if (education.equalsIgnoreCase("doctors")) premium -= ((premium * 10) / 100);
            else premium += ((premium * 5) / 100);

            System.out.println("customer, here's your quote!");
            System.out.println("Start Your Policy Today For:"+"$"+premium);

            referenceNumber+=name.substring(0,2).toUpperCase()+age+name.substring(name.length()-2,name.length()).toUpperCase();
            education=education.replace(" ","");
            referenceNumber+=""+zipcode+education.toUpperCase();

            System.out.println("Reference number: "+referenceNumber);
        }
        else {
            System.out.println("Invalid data!");
            System.exit(0);
        }


    }
}
