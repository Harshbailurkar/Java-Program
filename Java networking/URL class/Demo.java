import java.net.URL;

public class Demo {
    public static void main(String args[]) throws Exception {
        URL url = new URL("http://www.javatpoint.com/java-tutorial");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host Name: " + url.getHost());
        System.out.println("Port Number: " + url.getPort());
        System.out.println("File Name: " + url.getFile());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Ref: " + url.getRef());
        System.out.println("Authority: " + url.getAuthority());
        System.out.println("Default Port: " + url.getDefaultPort());
        System.out.println("UserInfo: " + url.getUserInfo());
        System.out.println("External Form: " + url.toExternalForm());

    }
}