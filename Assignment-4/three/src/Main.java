//Write the java program to  calculate Fibonacci Series up to n numbers.
//        (Research on your own regarding the Fibonacci Series) [5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        System.out.println("FIBONACCI SERIES:\n");
        System.out.println("ENTER THE NUMBER OF TERMS:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //display of fibonacci
        int first = 0, second = 1;
        System.out.println("The fibonacci series upto "+ num +" terms are :");
        System.out.print(first + " " + second);
        for (int i = 3; i <= num; i++) {
            int next = first + second;
            System.out.print(" "+next);
            first = second;
            second = next;
        }
    }
}