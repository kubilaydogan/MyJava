package Konular_Level2.Comparable_Interface;
/*
    java.lang.Comparable
    Comparable interface has only 1 abstract method --> int compareTo(T o)
    Compares this(current) object with the specified (parameter) object for order.
    Returns a negative integer if this object is less than the specified object
            zero --> if equal
            positive --> greater than

 */

public class Car implements Comparable<Car>{
    private String model;
    private int year;

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // must override
    @Override
    /*
     * This is where we write the logic to sort. This method sort
     * automatically by the first name in case that the last name is
     * the same.
     */
    public int compareTo(Car c) {
        if(this.year==c.year)
            return 0;
        else if(this.year>c.year)
            return 1;
        else
            return -1;
    }

}
