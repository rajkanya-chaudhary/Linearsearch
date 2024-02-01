public class Mergesortfunction 
{
    public static void mergesort(int arr[],int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }
        int mid = si +(ei - si)/2; // mid
        mergesort(arr, si, mid);// left 
        mergesort(arr, mid + 1, ei);// right
        merge(arr,si,mid,ei);
    }    
        // merge
        public static void merge(int arr[],int si , int mid , int ei)
        {
         int temp[] = new int[ei - si + 1];
         int i = si; // left iterator
         int j = mid + 1; // right iterator
         int k = 0;
         while (i <= mid && j <= ei) {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
            
           }
           // letf  part sort
           while (i <= mid) {
               temp[k++] = arr[i++];
               
           }
           // right part sort
           while (j <= ei) {
             temp[k++] = arr[j++];
           }
           for(k = 0, i=si; k<temp.length;k++,i++)
           {
            arr[i] =  temp[k];
           }

        }
        public static void Arrprint(int arr[])
        {
        for(int i = 0;i<arr.length;i++)
        {
             System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,9,4,10,44,22};
        mergesort(arr, 0, arr.length-1);
        Arrprint(arr);

    }
}
