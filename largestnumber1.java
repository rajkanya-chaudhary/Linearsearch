public class largestnumber1 {
    public static void main(String[] args) {
        int a[] = {22,55,77,55,90};
        int largest = a[0];
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                largest = a[i];
            }
        }
        System.out.println(largest);
    }
}
