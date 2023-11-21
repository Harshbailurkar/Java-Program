import java.io.*;
import java.net.*;

public class ClientCode {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 8081);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeInt(3);
        dos.flush();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        int square = (int) dis.readInt();
        System.out.println(square);
        dos.flush();
        dis.close();
        dos.close();
        s.close();

    }
}
