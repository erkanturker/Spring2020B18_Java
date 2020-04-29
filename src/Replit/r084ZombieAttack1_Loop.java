package Replit;
/*
084. Zombie Attack 1_Loop
A variable inhabitants represents a city and its respective populations.
 City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
  After each day, a city will lose half of its population.
  write a program to loop the city population and make it lose half of its popu
 */

import java.util.Scanner;

public class r084ZombieAttack1_Loop {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day= 0;
        for (int i = inhabitants; i>0 ; i/=2) {
            System.out.println ("Day "+day+" " +"["+i+"]");
            day++;


        }
        System.out.println ("---- EXTINCT ----");

    }
}
