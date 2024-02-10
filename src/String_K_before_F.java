public class String_K_before_F {
    public static void main(String[] args) {

        System.out.println(insertKBeforeFs("Fluffy"));          // KFluKfKfy
    }

    public static String insertKBeforeFs(String text) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'F' || sb.charAt(i) == 'f') {
                sb.insert(i, 'K');
                i++;    // Increment i to skip the inserted 'K'
            }
        }
        return sb.toString();
    }
}
