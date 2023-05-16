import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)
    {

        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();
            System.out.println("A Client is Connected");

            //used for socket value(message)
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //used for getting user typed input
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            //pen to write a message
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);

            String sendingMessage, receivingMessage;
            while (true) {
                //sending to client
                sendingMessage = userInputReader.readLine();
                printWriter.println(sendingMessage);
                printWriter.flush();

                //receiving message from client
                receivingMessage =socketDataReader.readLine();
                System.out.println(receivingMessage);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}