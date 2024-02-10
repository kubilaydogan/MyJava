package Konular_Level2.Predicate;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Coffee> menu = new ArrayList<>();
        menu.add(new Coffee("Nescafe"));
        menu.add(new Coffee("Starbucks"));
        menu.add(new Coffee("Dunkin"));
        menu.add(new Coffee("Turkish"));

        for (Coffee each:menu){
            System.out.print(each.getType() + " ");
        }
        System.out.println();

        menu.removeIf(new LongCoffeNames());            //****

        for (Coffee each:menu){
            System.out.print(each.getType() + " ");
        }

    }
}





