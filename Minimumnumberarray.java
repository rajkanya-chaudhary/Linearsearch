public class Minimumnumberarray {
    public static void main(String[] args) {
        int arr[] = {23,59,68,77,80};
        int minimum = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i] < minimum)
            {
                minimum = arr[i];
            }
        }
        System.out.println("minimum number of array = " + minimum);
    }
}
