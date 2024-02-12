package Konular;

public class Konu_SystemOutFormat {
    public static void main(String[] args) {

        test("John", "New Jersey");
        cookie(5);

    }

    public static void test(String x, String y) {
        System.out.format("How are you %s? Are you still in %s ?\n", x, y);
    }

    public static void cookie(int count) {
        System.out.format("I have %d cookies.\n", count);
    }

}
