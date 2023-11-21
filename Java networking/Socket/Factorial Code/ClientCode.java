import java.io.*;
import java.net.*;

public class ClientCode {

    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 8080);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.write(5);
        dos.flush();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        long fact = (long) dis.readLong();
        System.out.println("Factorial of 5 is: " + fact);
        dos.close();
        s.close();
        dis.close();

    }
}
