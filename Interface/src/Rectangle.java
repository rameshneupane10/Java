public class Rectangle implements Shape , AnotherShape
{
    @Override
    public void getArea()
    {
        System.out.println("area of rectangle :"+length* breadth);

    }

    @Override
    public void getColor()
    {
        System.out.println("color of rectangle :"+color);
    }
}
