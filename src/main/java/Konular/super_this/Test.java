package Konular.super_this;

/*
    super keyword invokes the matching superclass constructor.
    --> super() is used to invoke no-arg super class constructor
    --> super(param)
*/

public class Test {
    public static void main(String[] args) {
        Water w1 = new Water("su", "drink");
        System.out.println(w1.name);        // su
        System.out.println(w1.type);        // drink

        Water w2 = new Water("voda");
        System.out.println(w2.type);        // cold

        Water w3 = new Water();
        System.out.println(w3.name);        // coffee
    }
}

class Likit {
    String name;
    String type;

    public Likit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Likit(String name) {
        this.name = name;
        this.type = "cold";
    }

    public Likit() {
        this.name = "coffee";
        this.type = "hot";
    }
}

class Water extends Likit {
    public Water(String name, String type) {
        super(name, type);
    }
    public Water(String name) {
        super(name);
    }

    public Water() {
        super();
    }
}
