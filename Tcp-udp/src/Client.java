
import java.io.*;
import java.net.Socket;

public class Client
{
    public static void main(String[] args)
    {

        try {
           Socket  socket = new Socket("172.0.0.1",1234);


            BufferedReader socketDataReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            BufferedReader userInputReader =new BufferedReader(new InputStreamReader(System.in));

            OutputStream outputStream = socket.getOutputStream();

            PrintWriter printWriter =new PrintWriter(outputStream,true);

            String sendingMessage,receivingmessage;
            while (true)
            {
                receivingmessage=socketDataReader.readLine();
                System.out.println(receivingmessage);

                sendingMessage=userInputReader.readLine();
                printWriter.println(sendingMessage);
                printWriter.flush();
            }



        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
