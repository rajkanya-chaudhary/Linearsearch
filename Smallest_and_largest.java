public class Smallest_and_largest {
    public static void main(String[] args) {
        int arr[] = {2,4,5,3,7};
        int Smallest = arr[0];
        int Largest = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > Largest)
            {
                Largest = arr[i];
            }
            if(arr[i] < Smallest)
            {
                Smallest = arr[i];
            }
        }
        System.out.println("Largest number of array = " + Largest);
        System.out.println("Smallest number of array = " + Smallest);
    }
}
