public class Frequencyofaaray {
    public static void main(String[] args) {
        int arr[]= {2,4,5,6,6,7,4,2,5,9};
        for(int i = 0;i<arr.length;i++)
        {
            int x = arr[i];
            int count = 0;
            if(x == -1)
            {
                continue;
            }
            for(int j = 0; j<arr.length;j++)
            {
                if(arr[j] == x)
                {
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println("Fruency of array " + x + " is " + count);
        }
    }
}
