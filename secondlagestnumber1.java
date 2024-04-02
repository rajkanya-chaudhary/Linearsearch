public class secondlagestnumber1 {
    public static void main(String[] args) {
        int a[] = {22,55,77,55,90};
        int temp = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("second largest number = " + a[1]);
    }
}
