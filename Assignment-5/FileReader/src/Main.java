import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception
    {
        File file =new File("file.txt");

        //writes in  file.txt
        FileOutputStream fileOutputStream= new FileOutputStream("file.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        Bikes bike=new Bikes();
        objectOutputStream.writeObject(bike);

        // Reads the obj from file.txt
        FileInputStream fileInputStream=new FileInputStream("file.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Bikes bikes1=(Bikes) objectInputStream.readObject();

        // printing out the data
        System.out.println("BRAND :" +bikes1.Brand);
        System.out.println("MODEL :" +bikes1.Model);
        System.out.println("CC :" +bikes1.CC);
        System.out.println("PRICE :"+bikes1.Price);
    }
}