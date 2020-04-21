package day15_NestedLoop;

/*
Write a code that can divide two number without
divison operator

 */

public class divisonwithoutoperator {
    public static void main(String[] args) {
        int num1= 15;
        int num2=4;
        int count=0;

        while (num1>=num2){

            num1-=num2;
            count++;

        }
        int reminder = num1;
        System.out.println("divison is "+count);
        System.out.println("reminder is "+reminder);
    }
}
