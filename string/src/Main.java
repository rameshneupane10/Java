public class Main {
    public static void main(String[] args)
    {
        String name = "Ramesh ";
        name = name + " Neupane";
        System.out.println(name);

        // this will  create the new instance of the string
        String sem = new String("4th semester");
        System.out.println(sem);

        //stringbuffer
         StringBuffer s4 = new StringBuffer("new");
         s4.append("file ");
        System.out.println(s4);
    }
}