public class Shape
{
//   public int width =10 ;
//    public int height =20 ;
//
//
//    public void area()
//    {
//        System.out.println("area of shape is "+width * height);
//    }



//    // default constructor
        Shape()
        {
            width=10;
            height=20;
        }

    // parametrized constructor
        public int width;
        public int  height;
    Shape(int w , int h)
    {
        width=w;
        height=h;
   }

    public void area()
    {
        System.out.println("area of shape is "+width * height);
   }


}




