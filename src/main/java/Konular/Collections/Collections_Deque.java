package Konular.Collections;
import java.util.ArrayDeque;
import java.util.Deque;

public class Collections_Deque {
    public static void main(String[] args) {
        // A queue is designed to have elements inserted at the end of the queue,
        // and elements removed from the beginning of the queue.
        // Where as Dequeue represents a queue where you can insert and remove
        // elements from both ends of the queue.

        /* *** FIFO *** */
        Deque<String> queue = new ArrayDeque<>();
        String s = queue.pollFirst();   // null

        queue.offer("A");
        queue.offer("B");            // [A, B]
        queue.offerFirst("C");       // [C, A, B]
        queue.offerLast("D");        // [C, A, B, D]

        /* GET ELEMENT */
        String first = queue.peek();        // C
        String first2 = queue.peekFirst();  // C
        String last = queue.peekLast();     // D

        /* GET & REMOVE ELEMENT */
        System.out.println(queue.pollFirst());  // C
        System.out.println(queue);              // [A, B, D]

        System.out.println(queue.pollLast());   // D
        System.out.println(queue);              // [A, B]

        System.out.println(queue.pop());        // A
        System.out.println(queue);              // [B]
    }
}
