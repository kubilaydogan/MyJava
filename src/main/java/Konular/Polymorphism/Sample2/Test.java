package Konular.Polymorphism.Sample2;

public class Test {
    public static void main(String[] args) {

        Hero hero = new Superman();
        System.out.println(hero.sayHi("Mike"));
        System.out.println(hero.sayHi("Jack"));

    }
}

class Hero{
    protected String sayHi(String name){
        return "Hi " + name;
    }
}

class Superman extends Hero{

    // subclass can widen but cannot narrow access of overridden methods
    @Override
    public String sayHi(String name){
        name = name.toUpperCase();
        return "Hi " + name;
    }
}



