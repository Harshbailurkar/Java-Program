import java.io.*;
import java.net.*;

public class ServerCode {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8081);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        int num = (int) dis.readInt();
        int square = num * num;
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeInt(square);
        dos.flush();
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
}
