package Konular_Level2.Predicate;

import java.util.function.Predicate;

public class LongCoffeNames implements Predicate<Coffee> {

    @Override
    public boolean test(Coffee coffee) {
        return coffee.getType().length()>6;
    }
}
