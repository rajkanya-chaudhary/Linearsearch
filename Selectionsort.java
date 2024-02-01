public class Selectionsort {
    public static void main(String[] args) {
        int a[] = {53,23,58,79,50,30};
        int minposi , temp = 0;
        for(int i = 0;i<a.length;i++)
        {
            minposi = i;
            for(int j = i+ 1;j<a.length;j++)
            {
                if(a[j] < a[minposi])
                {
                    minposi = j;
                }
            }
            temp = a[i];
            a[i] = a[minposi];
            a[minposi] = temp;
        }
        for(int i = 0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");

        }
    }
}
