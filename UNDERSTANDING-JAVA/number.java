import java.util.Scanner;

public class number {
    
    public static void main(int[] args)
    {
        System.out.println("Enter the Number:");
        Scanner input = new Scanner(System.in);

       String num = input.nextLine();
       String product = num * 50;
       System.out.println("The product of the given number with 50 is :" + product);


        
    }
}
