package Konular_Level2;

public class OuterClass {
    private static String msg = "GeeksForGeeks";

    public static class NestedStaticClass {

        // Only static members of Outer class is directly accessible
        // in nested static class
        public void printMessage() {
            System.out.println("Message from nested static class: " + msg);
        }
    }

    // non-static nested class - also called Inner class
    public class InnerClass {

        // Both static and non-static members of Outer class
        // are accessible in this Inner class
        public void display() {
            System.out.println("Message from non-static nested class: " + msg);
        }
    }
}
