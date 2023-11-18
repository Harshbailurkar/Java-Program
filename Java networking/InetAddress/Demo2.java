import java.net.*;

public class Demo2 {
    public static void main(String args[]) throws Exception {

        InetAddress address1 = InetAddress.getByName("www.google.com");
        InetAddress address2 = InetAddress.getByName("www.facebook.com");

        System.out.println(address1.equals(address2));
        String i1 = address1.getHostAddress();
        String i2 = address1.getHostName();
        boolean i3 = address1.isMulticastAddress();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

    }
}
