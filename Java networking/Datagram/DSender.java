import java.net.*;
public class DSender{
public static void main(String[] args) throws Exception
{
 DatagramSocket ds =new DatagramSocket();
String str ="Welcome java";
InetAddress ip= InetAddress.getByName("localhost");
int port=2000;
DatagramPacket  dp=new DatagramPacket(str.getBytes(), str.length(), ip,2000);
ds.send(dp);
ds.close();
}
}
