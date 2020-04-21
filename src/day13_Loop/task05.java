package day13_Loop;
/*

print all lower case and upper case alohabets from the AScii table

 */

public class task05 {

    public static void main(String[] args) {

        // main a~z ; A

        for(char chr='a'; chr<='z'; chr++){

            System.out.print(chr+" ");

        }
        System.out.println();
        for(char chr='A'; chr<='Z'; chr++){

            System.out.print(chr+" ");

        }
    }

}
