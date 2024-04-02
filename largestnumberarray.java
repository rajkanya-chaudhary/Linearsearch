public class largestnumberarray {
    public static void main(String[] args) {
        int arr[] = {20,30,40,60,70};
        int largest = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }

        System.out.println("Largest number of array  = " + largest);
        
    }
}
