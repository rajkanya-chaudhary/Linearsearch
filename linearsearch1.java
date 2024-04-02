public class linearsearch1 {
    public static void main(String[] args) {
        int arr[] = {2,5,8,3,1,9};
        int key = 9;
        int temp = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                System.out.println("key is found index no = " + i);
                temp++;

            }
            
        }
        if(temp == 0)
        {
            System.out.println("key is not found in this list ");
        }
    }

}
