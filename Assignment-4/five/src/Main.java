public class Main {
    public static void main(String[] args)
    {
        // input array
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[nums[i]];
        }


        // display output
        System.out.println("OUTPUT : ");

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ,");

        }
    }
}