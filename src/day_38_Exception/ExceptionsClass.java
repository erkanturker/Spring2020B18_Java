package day_38_Exception;

public class ExceptionsClass {
    public static void main (String[] args) throws InterruptedException {
        int []arr= {1,2,3};
        System.out.println (arr[3]); // thi s unchecked exception
        Thread.sleep ( 1000 ); // this is checked exception it needs to be handled immedialtely

    }
}
