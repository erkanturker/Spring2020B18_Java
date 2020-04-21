package day23_WrapperClassArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();


            while (true){

                System.out.println("Enter a name");
                String name= scanner.nextLine();
                arrayList.add(name);

                System.out.println("Do you want to continue");
                String answer =scanner.nextLine().toLowerCase();

                if(!(answer.equals("yes")||answer.equals("no"))) {
                    System.out.println("invalid");
                    break;
                }
                else if(answer.equals("no")){

                    break;
                }

            }

        System.out.println(arrayList);

    }



}
