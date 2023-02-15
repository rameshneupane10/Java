import java.util.Scanner;

public class Main{
public static void main(String[] args) 
{
    //nuclear reactor name
    System.out.println("\n\n\n\n\n\n\t\t\t\tNUCLEAR REACTOR : JX00-XC-HB1\n\t\t\t\t\t\t\t-JAPAN");

    //total number of employees
    System.out.println("\n\nWhat is the total number of employees?");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    


    //name of the supervisor
    System.out.println("What is the name of supervisor?");
    Scanner input1 = new Scanner(System.in);
    String name = input1.nextLine();
    

    //times of nuclear core removal
    System.out.println("How many times the Nuclear waste is removed from the core?");
    Scanner input2 = new Scanner(System.in);
    int num1 = input2.nextInt();


    //total weight of the waste
    System.out.println("What is the total weight of the waste produced every 1 week?");
    Scanner input3 = new Scanner(System.in);
    float num2 = input3.nextFloat();
    


    //electric motor replaced or not
    System.out.println("Is Electric Motor being replaced every 18 days? Press 'y' for yes and 'n' for no");
    Scanner input4 = new Scanner(System.in);
    char ans = input4.next().charAt(0);
    


    //temperature of the reactor
        System.out.print("What is the core average temperature ( celsius ) of the Nuclear Reactor? ");
        float tempCelsius = input4.nextFloat();
        float tempKelvin = tempCelsius + 273.15f;
       


    //output
    System.out.println("\n\n\n number of employees \n: "+num);
    System.out.println(" name of the Supervisor \n: "+name);
    System.out.println(" number of times the Nuclear waste is removed from the core \n :"+num1);
    System.out.println(" total weight of the waste produced every 1 week \n:"+num2);
    System.out.println(" electric motor is being replaced (yes=y and No=n):\n"+ans);
    System.out.printf("core average temperature is %.2f°C (%.2fK)\n", tempCelsius, tempKelvin);





}
}