package Konular.Polymorphism.Sample1;

public class Test {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.displayInfo();                // I am an animal.

        Animal d = new Dog();
        d.displayInfo();               // I am a dog.
        d.animal();                    // This is an animal

        Dog dog = new Dog();
        dog.displayInfo();              // I am a dog.
        dog.animal();                   // This is an animal
    }
}

class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }

    public void animal() {
        System.out.println("This is an animal");
    }

}


class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}
