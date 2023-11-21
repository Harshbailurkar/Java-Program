import java.io.*;
import java.net.*;

public class ServerEg {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = (String) dis.readUTF();
        System.out.println("Message from client: " + str);
        ss.close();

    }
}
