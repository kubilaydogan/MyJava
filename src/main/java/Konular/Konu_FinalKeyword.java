package Konular;



public final class Konu_FinalKeyword {
    static final double PI;             // a blank final variable  ==> static cannot be in main method
    final int  MINIMUM;                 // this also cannot be in main method as it is initialized in the constructor

    static{
        PI = 3.141592653589793;
    }

    public static void main(String[] args) {
        final int AGE = 23;             // initialize directly a final variable
        final int CAPACITY;             // a blank final variable

        {
            CAPACITY = 25;              // instance initializer block
        }

    }

    public final static void staticSystemPolicy() {
        System.out.println("DO NOT CHANGE THIS STATIC POLICY");
    }

    public Konu_FinalKeyword() {
        MINIMUM = -1;
    }
    public final void systemPolicy() {
        System.out.println("DO NOT CHANGE THIS POLICY");
    }
}
