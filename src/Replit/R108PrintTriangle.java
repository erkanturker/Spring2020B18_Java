package Replit;

import java.util.Scanner;

public class R108PrintTriangle {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str="";
        for (int k = 1; k <=n ; k++) {
            str+="*";
            System.out.println (str);
        }
    }
}
