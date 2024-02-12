package Konular;

public class Konu_Access_Modifiers {

    public int age;             // visible to any other class
    protected int yas;          // visible to classes in the same package ot to subclasses
    private int year;           // visible only within the class
    int day;                    // default : visible only to classes in the same package

    public static void main(String[] args) {

        // public ---> To invoke this method from outside of this class
        // static ---> To invoke this method without creating an instance of this class
        // void   ---> Bcos it does not return a value
        // main   ---> The method name must be called main

        // It must accept array of String objects as the only parameter.
        // args is irrelevant


    }
}
