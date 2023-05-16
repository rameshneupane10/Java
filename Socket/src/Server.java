import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args)
    {
        System.out.println("SERVER");

        try
        {
            ServerSocket serverSocket = new ServerSocket(12345);
            serverSocket.accept();
            System.out.println("  A new client has connected");
        } catch (IOException e) {

            System.out.println("cannot connect to the server");
            throw new RuntimeException(e);
        }


    }
}