public class Main {
    public static void main(String[] args)
    {
        int arr []={5,5,5,5,6} , i=0,sum=0;
        while (i< arr.length)
        {
            sum=sum + arr[i];
            i++;
        }
        System.out.println("the sum of array is "+ sum);

    }
}