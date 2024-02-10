import java.net.HttpURLConnection;
import java.net.URL;

public class HTTP_LinkChecker {

    public static void main(String[] args) {
        String link = "https://example.com";
        System.out.println(isLinkBroken(link));
    }

    public static boolean isLinkBroken(String link) {
        try {
            URL url = new URL(link);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int responseCode = connection.getResponseCode();
            connection.disconnect();
            return responseCode != HttpURLConnection.HTTP_OK;
        } catch (Exception e) {
            return true;
        }
    }
}
