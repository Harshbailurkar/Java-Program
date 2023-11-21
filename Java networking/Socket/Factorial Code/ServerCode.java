import java.io.*;
import java.net.*;

public class ServerCode {
    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(5555);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        int number = dis.readInt();

        long factorial = calculateFactorial(number);

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeLong(factorial);

        s.close();
        ss.close();
    }

    private static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
