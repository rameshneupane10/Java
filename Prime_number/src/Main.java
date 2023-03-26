import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        // taking the input
        System.out.println("Enter the Number:-");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // prime or not
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0 && i != 1 && i != num)
            {
                count++;
            }
        }
        /*alernative method
        for(int i=1;i<=num;i++)
        {
            if(num % i==0)
            {
                count++;
            }
        }
         */

        //displaying result
        if (count == 0)
        {
            System.out.println("The number "+num+" is prime");
        } else
        {
            System.out.println("The number "+num+" is not prime");
        }
    }
}
