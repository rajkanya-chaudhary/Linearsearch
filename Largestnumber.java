public class Largestnumber {
    public static void main(String[] args) {
        int arr[] = {20,40,60,76,99};
        int largest = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("Largest number of array = " +largest);
    }
}
