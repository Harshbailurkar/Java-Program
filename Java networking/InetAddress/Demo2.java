import java.net.*;

public class Demo2 {
    public static void main(String args[]) throws Exception {

        InetAddress address1 = InetAddress.getByName("www.google.com");
        InetAddress address2 = InetAddress.getByName("www.facebook.com");

        System.out.println(address1.equals(address2));
        String i1 = address1.getHostAddress();
        String i2 = address1.getHostName();
        boolean i3 = address1.isMulticastAddress();
        byte[] i4 = address1.getAddress();

        System.out.println(i1); // false
        System.out.println(i2); // 142.250.199.132
        System.out.println(i3); // www.google.com
        for (byte b : i4) {
            System.out.print(b + " "); // -114 -6 -57 -124
        }

    }
}
