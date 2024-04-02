public class Largest_element_using_Recursion {
    
    public static int largest(int arr[]) {
        int i;
        // Initialize maximum element
        int max = arr[0];
        // Traverse array elements from second and compare every element with current
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 324, 45, 90, 98 };

        System.out.println("Largest in given array is =  " + largest(arr));
    }
}


