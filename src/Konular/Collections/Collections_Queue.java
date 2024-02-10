package Konular.Collections;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collections_Queue {
/*
    FIFO(First In First Out)
       --> add elements to end, delete from beginning

                    Throws Exception
        OFFER            ADD
        PEEK           ELEMENT      (we see difference when queue is empty)
        POLL           REMOVE       (we see difference when queue is empty)
 */

    public static void main(String[] args) {
        // Since Queue is an interface, we cann't use "new Queue<>()"
        // Common way to use:
        Queue<Integer> queue = new LinkedList<>();         // keeps insertion order
        Queue<Integer> queue2 = new PriorityQueue<>();     // sorts the elements

        queue.add(1); queue.add(2); queue.add(3);
        queue.offer(4); queue.offer(5);

        System.out.println(queue.add(6));           // true
        System.out.println(queue.offer(7));      // true

        System.out.println(queue);                  // [1, 2, 3, 4, 5, 6, 7]

        /* *** Herhangi bir elemeni silme *** */
        queue.removeIf(integer -> integer == 4);        // iterator

        System.out.println(queue.peek());       // 1 --> used to see the head
        System.out.println(queue.poll());       // 1 --> 1 removed from queue
        System.out.println(queue.remove());     // 2 --> 1 removed from queue
        System.out.println(queue);              // [3, 5, 6, 7]
        queue.clear();

        System.out.println(queue.peek());       // null
        System.out.println(queue.poll());       // null

        try{
            System.out.println(queue.remove());         // throws exception if queue is empty
            System.out.println(queue.element());        // throws exception if queue is empty
        }catch(NoSuchElementException e){
            System.out.println((Object) null);
        }

    }
}
