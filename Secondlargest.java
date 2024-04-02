public class Secondlargest {
    public static void main(String[] args) {
        int arr[] = {1,4,6,3,8,9};
        int temp = 0;
        int i,j;
        for(i = 0;i<arr.length;i++)
        {
            for(j = i+ 1;j<arr.length;j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second largest number = " + arr[1]);
    }
}
