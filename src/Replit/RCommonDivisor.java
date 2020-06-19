package Replit;

public class RCommonDivisor {
    public static void main (String[] args) {
        System.out.println ( commonDivisor ( 12, 18 ) );
    }

    public static int commonDivisor (int m, int n) {
        //WRITE YOUR CODE HERE

        int endingPoint = (m < n) ? m : n;
        int cDiv = 1;

        for (int i = 1; i <= endingPoint; i++) {
            if (m % i == 0 && n % i == 0) cDiv = i;

        }

        return cDiv;
    }
}
