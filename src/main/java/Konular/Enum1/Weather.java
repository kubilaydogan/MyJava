package Konular.Enum1;

public enum Weather {
    HOT("Warning! It's hot!!"),         // use , not ;
    WARM("Just right"),
    COLD("It's cold");

    private String warning;

    private Weather(String warning) {
        this.warning = warning;
    }

    public String getWarning() {
        return warning;
    }
}
