package day15_NestedLoop;
/*
loop inside a loop
    for(ini; condio; iterator){
    for(ini; condio; iterator){
    "Hello"
    }
    }
    while (condition){
    while(condition){
    statements
    }
    }
outter loop repeats the inner loop
when do we use nested loop: when we need to repeat some steps inside loops body

 */

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

        /*for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j <=5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */
        System.out.println("=======================");
        int j=5;
        while(j>0){
        int i=0;
        while(i<=5){
            System.out.print("*");
            i++;
        }
            System.out.println();
            j--;
        }

    }
}
