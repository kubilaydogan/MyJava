package Konular.Inheritance;

public class Test {
    public static void main(String[] args) {
        CRV crv = new CRV();
        crv.crvMethod();            // This is a CRV

        Honda car = new CRV();
        car.model(car);             // This is a CRV
    }
}



// instanceof operator is used to verify the object type
// Then we do the casting based on the object type

class Honda {
    public void model(Honda car) {
        if (car instanceof CRV) {
            ((CRV) car).crvMethod();        // casting is necessary
        } else if (car instanceof CIVIC) {
            ((CIVIC) car).civivMethod();
        }
    }
}

class CRV extends Honda {
    public void crvMethod() {
        System.out.println("This is a CRV");
    }
}

class CIVIC extends Honda {
    public void civivMethod() {
        System.out.println("This is Honda Civic");
    }
}
