//Make the Currency converter program where Nepali rupees are converted to the USD.
// Take the currency difference as 1 USD = 135.03 for conversation. [5 marks]


import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(" CURRENCY CONVERTOR 💵💵:\n");

        //nepali currency
        System.out.println("Enter the Nepali Rupees to convert:\t");
        Scanner scanner = new Scanner(System.in);
        int cash = scanner.nextInt();

        //conversion
        double dollar = cash * 135.03;
        System.out.println("CONVERSION : ");
        System.out.println(cash + " RS."+" = "+dollar+" $");
    }
}