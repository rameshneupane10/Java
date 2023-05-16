import javax.naming.NamingEnumeration;
import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException
    {

            DatagramSocket Socket =new DatagramSocket();
            String message = "Hello World";
            DatagramPacket Packet = new DatagramPacket(message.getBytes(),message.length(), InetAddress.getByName("localhost"),12345);


            // sending packet via socket
        System.out.println("sending message...");
        Socket.send(Packet);


    }
}