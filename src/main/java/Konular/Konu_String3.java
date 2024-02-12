package Konular;

public class Konu_String3 {
    public static void main(String[] args) {

        // .startWith()  &  .endsWith()

        String str = "Bugun gunlerden pazar";
        System.out.println(str.startsWith("B"));       // true
        System.out.println(str.startsWith("Bu"));      // true
        System.out.println(str.startsWith("BU"));      // false
        System.out.println(str.toUpperCase().startsWith("BU"));      // true

        System.out.println(str.startsWith("gun", 6));  // true

        System.out.println(str.endsWith("ar"));      // true

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        String [] days = { "Monday", "Tuesday", "Wednesday" };

        for(String each: days){
            if(each.startsWith("W")){
                System.out.println(each);
            }
        }

        System.out.println( days[1].endsWith("day"));

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



    }
}
