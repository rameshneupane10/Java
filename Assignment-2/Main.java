import java.util.Scanner;

public class Main{
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);

    //nuclear reactor name
    System.out.print("\n\n\n\t\t\t\t-----------------------------------------");
    System.out.println("\n\n\n\n\t\t\t\t\tNUCLEAR REACTOR : JX00-XC-HB1\n\t\t\t\t\t\t\t-JAPAN");
    System.out.print("\n\t\t\t\t-----------------------------------------");

    //total number of employees
    System.out.println("\n\nWhat is the total number of employees?");
    int num = input.nextInt();
    

    //name of the supervisor
    System.out.println("What is the name of supervisor?");
    input.nextLine();
    String name = input.nextLine();
    

    //times of nuclear core removal
    System.out.println("How many times the Nuclear waste is removed from the core?");
    int num1 = input.nextInt();


    //total weight of the waste
    System.out.println("What is the total weight of the waste produced every 1 week?");
    float num2 = input.nextFloat();
    

    //electric motor replaced or not
    System.out.println("Is Electric Motor being replaced every 18 days? Press 'y' for yes and 'n' for no");
    char ans = input.next().charAt(0);
    

    //temperature of the reactor
        System.out.print("What is the core average temperature ( celsius ) of the Nuclear Reactor? ");
        float tempCelsius = input.nextFloat();
        float tempKelvin = tempCelsius + 273.15f;
       

    //updated screen
    System.out.print("\n-----------------------------------------");
    System.out.print("\n\tUPDATE COMPLETED!!!");
    System.out.print("\n-----------------------------------------");

    //output
    System.out.println("\n\n\n number of employees \t\t\t\t\t\t: "+num);
    System.out.println(" name of the Supervisor \t\t\t\t\t: "+name);
    System.out.println(" number of times the Nuclear waste is removed from the core \t: "+num1);
    System.out.println(" total weight of the waste produced every 1 week \t\t:"+num2);
    System.out.println(" electric motor is being replaced (yes=y and No=n)\t\t:"+ans);
    System.out.printf("core average temperature is\t\t\t\t\t:%.2f°C (%.2fK) ", tempCelsius, tempKelvin);





}
}