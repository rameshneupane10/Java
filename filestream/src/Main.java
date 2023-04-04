import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("ramesh.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Person person = new Person();
        objectOutputStream.writeObject(person);

        FileInputStream fileInputStream = new FileInputStream("ramesh.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 =(Person) objectInputStream.readObject();
        person1.getName();

    }
}