import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args)
    {

        try {
            Scanner scanner=new Scanner(System.in);
            ServerSocket ss = new ServerSocket(12345);
            Socket socket =ss.accept();
            System.out.println("connetion estabished");

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);
            printWriter.println(  scanner.nextLine());
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}