package day_38_Exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

public class ExceptionHandling {
    public static void main (String[] args) {
        CountDownLatch count = new CountDownLatch ( 10 );
         count.countDown ();

        /*
				try{
					exception statements/code
				} catch(ExceptionClass name){
					statements
				}
         */
        int[] number = {1, 2, 3, 4, 5, 6};
        System.out.println ( "Task is done" );
        try {
            System.out.println ( number[111] );
        } catch (ArrayIndexOutOfBoundsException anyname) {
            System.out.println ( "You dont have this Index" );
        }
        int z = 4;
        while (z>0){
            try {
                Thread.sleep ( 1000 );
                z--;
                System.out.println (z);
            } catch (InterruptedException e) {

            }
        }

        ArrayList<Integer> list = new ArrayList<> (  );
        list.addAll ( Arrays.asList(1,2,4,5));

        list.get ( 6 );


    }
}
