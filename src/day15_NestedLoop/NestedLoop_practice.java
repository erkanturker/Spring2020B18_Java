package day15_NestedLoop;

public class NestedLoop_practice {
    public static void main(String[] args) {
        for (int i = 1; i <=7 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println("=================");

        for (int i = 6; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
