import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Client
{
    public static void main(String[] args)
    {


        try {
            Socket socket = new Socket("127.0.0.1",12345);

            //used for socket value(message)
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //used for getting user typed input
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            //pen to write a message
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);

            String sendingMessage, receivingMessage;
            while (true) {

                //receiving message from client
                receivingMessage =socketDataReader.readLine();
                System.out.println("Server: " + receivingMessage);


                //sending to client
                sendingMessage = userInputReader.readLine();
                printWriter.println("Client: "+ sendingMessage);
                printWriter.flush();


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }

