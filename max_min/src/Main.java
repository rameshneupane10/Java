public class Main {
    public static void main(String[] args)
    {
        int i, j, temp;
        int arr[] = {4, 6, 9, 2, 12, 24, -1};
        int min = arr[0];
        int max = arr[0];

        for(i = 0; i < arr.length; i++)
        {
            for(j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (arr[i] < min)
            {
                min = arr[i];
            }
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("The minimum element is >> " + min);
        System.out.println("The maximum element is >> " + max);
    }
}
