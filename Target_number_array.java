public class Target_number_array {
    public static int[] printtarget(int arr[],int target)
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+ 1;j<arr.length;j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    int a[] = {i,j};
                    return a;
                }
            }
        }
        return null;


    }
    public static void main(String[] args) {
        int arr[] = {1,6,5,3,7};
        int target = 9;
        printtarget(arr, target);
        System.out.println(printtarget(arr, target));
    }
}
