import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args)
    {

        //creating new file
        File file =new File("newfile.txt");
        try
        {
            file.createNewFile();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("File Created Successfully");
        }



        //writing on the file
        try
        {
            FileWriter fileWriter = new FileWriter("newfile.txt");
            fileWriter.write("This is 1 new file\n");
            fileWriter.write("This is 2 new file\n");
            fileWriter.write("This is 3 new file");
            fileWriter.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


        //reading from the file using buffer reader
        try
        {
            FileReader fileReader = new FileReader("newfile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
           //used for single line System.out.println(bufferedReader.readLine());
            //following is used for mutiple lines
            String line = bufferedReader.readLine();
            while (line != null)
            {
                System.out.println(line);
                line= bufferedReader.readLine();
            }

            fileReader.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }



    }
}