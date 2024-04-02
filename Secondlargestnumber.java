public class Secondlargestnumber {
    public static void main(String[] args) {
        int arr[] = {23,56,77,88,99};
        int temp = 0;
        int i, j;
        for(i = 0;i<arr.length;i++)
        {
            for(j = i + 1;j<arr.length;j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Largest Second number of array = " + arr[1]);


    }
    
}
