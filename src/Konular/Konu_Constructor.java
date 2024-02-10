package Konular;

public class Konu_Constructor {
    // (1) a constructor is a special method that initialized the objects
    // (2) must be named after the class
    // (3) must not have a return type
    // (4) must not defined as void
    // (5) <new> operator invokes the constructor
    // (6) Can be overloaded
    // (7) If you want to use the no-arg constructor, then you need to add it if there is also
    // another constructor with parameter(s)
}

class Demo {
    String name;

    public Demo() {
    }

    public Demo(String name) {
        this.name = name;
    }

    public Demo(String name, int age ) {
        this(name);         // A constructor can invoke another with this() ==> must be in first line
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        Demo d = new Demo("Heedo", 10);
    }


}
