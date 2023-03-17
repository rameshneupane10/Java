//Take a number as input and print the multiplication table for it. The multiplication table should start from 1 to 10. The output should be on format like this
//Suppose user gave 5 as a input:
//5 x 1 = 5
//5 x 2 = 10
//…. (repeat)
//5 x 10 = 50 [5 marks]


import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        int i;
        //taking the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int num = scanner.nextInt();

        //display
        System.out.println("\nThe multiplication table of given number is :  \n");

        //table part
        for( i=1;i<=10;i++)
        {
            int product=(num*i);
            System.out.print(num + " * " + i+ " = "+product+"\n");

        }


    }
}