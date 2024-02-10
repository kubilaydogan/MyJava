package Konular._Exceptions;


public class try_catch2 {
    public static void main(String[] args) {

        System.out.println("Beginning");

        try {
            doSomethingDangerous();
        } catch (InterruptedException e) {
            System.out.println("same exact action");
        } catch (Exception e) {
            System.out.println("cautght");
        }

        System.out.println("Ending");

    }

    public static void doSomethingDangerous() throws InterruptedException {
        System.out.println("some dangerous action with multiple consequences");
        throw new InterruptedException();
    }

}
