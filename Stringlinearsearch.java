public class Stringlinearsearch {
    public static void main(String[] args) {
        String a[] = {"dimpal","rohan","amit","Arjun","Aman"};
        String  item = "Aman";
        int temp = 0;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i].equals(item))
            {
                System.out.println("element present in " + i + " index position ") ;
                temp = temp + 1;
            }
        }
        if(temp == 0)
        {
             System.out.println("item is not found in this list ");
        }
    }
    
}
