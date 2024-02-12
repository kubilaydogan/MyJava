package Konular.Enum1;

import java.util.EnumMap;

public class Test {
    public static void main(String[] args) {

        getMessage(Weather.COLD);               // It's cold

        // ~~~~~~~~~~~~~~~~~~~~~~~~~

        Weather weather = Weather.WARM;
        for (Weather each : Weather.values()) {
            System.out.print(each + " ");               // HOT WARM COLD
        }

    }

    private static void getMessage(Weather weather) {
        switch(weather) {
            case HOT:
                System.out.println(Weather.HOT.getWarning());
                break;
            case COLD:
                System.out.println(Weather.COLD.getWarning());
                break;
            case WARM:
                System.out.println(Weather.WARM.getWarning());
                break;
        }
    }
}
