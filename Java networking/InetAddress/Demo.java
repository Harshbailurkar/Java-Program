
import java.net.*;

public class Demo {
    public static void main(String[] args) throws Exception {

        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.google.com");
        System.out.println(address);

        InetAddress[] addressList = InetAddress.getAllByName("www.google.com");

        for (InetAddress addr : addressList) {
            System.out.println(addr);
        }
    }
}