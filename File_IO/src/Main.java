import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        File file = new File("ramesh.txt");

        try
        {
            file.createNewFile();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("File Created Successfully");
        }


        //write something on this file
        try
        {
            FileWriter fileWriter = new FileWriter("ramesh.txt"); //pen to the file
            fileWriter.write("hii , ramesh here!");
            fileWriter.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


        //reads
        try
        {
            FileReader fileReader = new FileReader("ramesh.txt");
            int value;
            while ((value= fileReader.read())!= -1)
            {
                System.out.print((char)value);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}