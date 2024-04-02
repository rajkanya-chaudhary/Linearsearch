public class Reverse1array {
    public static void main(String[] args) {
        int arr[] = {40,67,58,45,34};
        int n = arr.length;
        int first = 0;
        int last = arr.length-1;
        while (first < last)
         {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
