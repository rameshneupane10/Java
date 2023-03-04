import javax.naming.Name;

public class Person
{

    int age;
    String name;
    //    // default constructor
    Person(String n , int a)
    {
       name=n;
       age=a;
    }





    public void introduce()
    {
        System.out.println("Hi , my name is " + name);
        System.out.println("i am "+age+" years old");
    }

}
