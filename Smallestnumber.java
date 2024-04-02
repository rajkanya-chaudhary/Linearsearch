public class Smallestnumber {
    public static void main(String[] args) {
        int arr[] = {3,7,99,5,94,88};
        int Smallest = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]<Smallest)
            {
                Smallest = arr[i];
            }
        }
        System.out.println("Smallest number of array = " + Smallest);
    }
}
