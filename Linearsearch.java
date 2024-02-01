public class Linearsearch {
    public static void main(String[] args) {
        int a[] = {1,6,8,4,3,7};
        int key = 10;
        int temp = 0;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i] == key)
            {
            System.out.println("Element is present at  " + i + " index position");
            temp = temp + 1;
        
            }
            
        }
        if(temp == 0)
        {
            System.out.println("item is not found in this list ");
        }
        

        
    }
    
}
