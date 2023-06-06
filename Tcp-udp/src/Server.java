import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)
    {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            Socket socket = serverSocket.accept();
            System.out.println("A new client is connected");

            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            String sendingMessage, ReceivingMessage;
            while(true) {
                sendingMessage = userInputReader.readLine();
                printWriter.println(sendingMessage);
                printWriter.flush();

                ReceivingMessage = socketDataReader.readLine();
                System.out.println(ReceivingMessage);
            }
        }
            catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }
