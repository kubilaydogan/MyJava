package Konular.Collections_New;

import java.util.Stack;

public class Collections_Stack {
    public static void main(String[] args) {
/*
    Stack class extends Vector
    Stack is based on the last-in-first-out (LIFO) principle
    A Stack is a data structure where you add elements to the "top"
    of the stack, and also remove elements from the top again.

    ==> UST USTE KONULMUS KITAPLAR GIBI, SON KOYDUGUNU ILK ALIRSIN
*/
        // push() = add() -> But return type for add() is booleaan
        // pop()  =>  get and delete
        // peek() => to verify
        // empty -> boolean , search ->find the index from top


        // List<Integer> stack = new Stack<>();     ERROR

        Stack<Integer> stack = new Stack<>();       // Creating a Stack with a Generic Type
        stack.push(40);
        stack.add(50);
        stack.add(2, 60);
        stack.push(60);
        stack.push(70);


        // you can also use add() instead of push(). BUT return types are different
        int n = stack.push(99);              // int n = stack.add(88); ==> ERROR
        boolean b = stack.add(100);               // b = true

        System.out.println(stack);                // [40, 50, 60, 60, 70, 99, 100]
        System.out.println(stack.get(1));         // 50
        System.out.println(stack.peek());         // 100   => check value on top of stack
        int v = stack.peek();                     // used to see whats on the top

        stack.pop();                                 // 100 deleted
        System.out.println(stack.pop());             // 99 displayed and deleted
        int wasHere = stack.pop();                   // saved the value, but deleted in stack

        System.out.println(stack);                   // [40, 50, 60, 60]
        System.out.println(stack.empty());           // false
        System.out.println(stack.capacity());        // 10
        System.out.println(stack.size());            // 4

        System.out.println(stack.search("december"));      // -1
        System.out.println(stack.search(50));              // 3     (sondan siralama)
        System.out.println(stack.firstElement());             // 40



        /* *** ROW TYPE *** */
        Stack stack1 = new Stack();
        stack1.add(22);
        stack1.push("december");

        Object obj = stack1.push("may");         // If we use raw type, then all elements are considered as Object.
        int x = (int) stack1.push(77);           // We need casting


    }
}
