public class ASCII {
    public static void main(String[] args) {

        String str = "abc";
        getASCII(str);          // a=97 b=98 c=99
        getASCII2(str);
        System.out.println(getASCIIofIndex(str, 2));        // 99
    }

    static int getASCIIofIndex(String str, int i) {
        char c = str.charAt(i);
        return (int) c;
    }

    private static void getASCII(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c + "=");
            sb.append((int) c);
            sb.append(" ");
        }
        System.out.println(sb);
    }

    private static void getASCII2(String str) {
        char[] c = str.toCharArray();
        for(char ch: c) {
            System.out.println("Ascii value of " + ch + " is: " + (int) ch);
        }
    }
}
