public class Main {
    public static void main(String[] args)
    {
        //upper traingle
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //lower traingle
        for (int i = 4; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}