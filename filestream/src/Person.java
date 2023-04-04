import java.io.Serializable;

public class Person implements Serializable
{
     int age =25;

     String name = "Ramesh Neupane";

     double height=5.7;

     String getName()
     {
          return  name;
     }

     int getAge()
     {
          return age;
     }

}
