import java.io.Serializable;

public class Bikes implements Serializable
{
    String Brand,Model;
    int CC,Price;
    Bikes()
    {
        Brand="Ducati ";
        Model ="Monster 796";
        CC=800;
        Price=255000;
    }
}