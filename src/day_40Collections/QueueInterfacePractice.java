package day_40Collections;
import java.util.*;
public class QueueInterfacePractice {
    public static void main (String[] args) {
        Queue< Integer > queue = new PriorityQueue<> ();
        queue.add ( 20 );
        queue.add ( 10 );
        queue.add ( 30 );
        System.out.println ( queue );
        //System.out.println (queue.get(0)); Queue interface has no get method
        int a = queue.poll ();// poll method FIFO(first in fist out it will remove first one and leave the others
        System.out.println ( queue );
        System.out.println ( a );


        Queue< String > queue1 = new PriorityQueue<> ();
        queue1.add ( "Erkan" );
        queue1.add ( "Asim" );
        queue1.add ( "Zehra" );
        queue1.add ( "Ekrem" );
        queue1.add ( "Turker" );
        System.out.println ( queue1 ); // queue is not  sorted method

        Deque< Integer > deque = new ArrayDeque<> ();
        deque.addFirst ( 10 );//10
        deque.addFirst ( 20 );//20, 10
        deque.addFirst ( 30 );//30 20, 10
        deque.addLast ( 40 );//30 20, 10 40
        System.out.println ( deque );
        deque.removeFirst ();
        System.out.println (deque);// 20, 10 40
        System.out.println (deque.getFirst ()); //20
        System.out.println (deque.getLast ());//40


    }
}
