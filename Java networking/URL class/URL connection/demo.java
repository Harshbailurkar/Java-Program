import java.net.URL;
import java.net.URLConnection;

public class demo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            System.out.println("Connected");
            System.out.println("Content: " + urlConnection.getContent());
            System.out.println("Content Length: " + urlConnection.getContentLength());
            System.out.println("Content Type: " + urlConnection.getContentType());
            System.out.println("Date: " + urlConnection.getDate());
            System.out.println("User Interaction:" + urlConnection.getAllowUserInteraction());
            System.out.println("Coonected Timeout " + urlConnection.getConnectTimeout());
            System.out.println("Last Modified: " + urlConnection.getLastModified());
            System.out.println("Expiration: " + urlConnection.getExpiration());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
