public class Integer_SwapTwoNumbers {

    /*
    Swap two variable' values without using a third variable
     */

    public void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
