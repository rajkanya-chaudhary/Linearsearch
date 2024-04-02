public class Insertionsort {
    public static void main(String[] args) {
        int arr[] = {5,7,1,3,9};
        for(int i = 1;i<arr.length;i++)
        {
            int curr = i;
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > arr[curr]) {
            int temp = arr[curr];
            arr[curr] = arr[prev];
            arr[prev] = temp;
            curr = prev;
            prev--;    

            }
        
        }
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        
    }
}
