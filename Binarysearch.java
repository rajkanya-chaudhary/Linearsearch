public class Binarysearch {
    public static void main(String[] args) {
        int a[] = {2,4,7,9,11,13,17,20,23,33};
        int key = 11;
        int loweridx = 0;
        int highidx = a.length-1;
        int mid = (loweridx + highidx) / 2;
        while (loweridx <= highidx) {
            if(a[mid] == key)
            {
                System.out.println("Element is at  "  + mid +  " Index position");
                break;
            }
            else if(a[mid] < key)
            {
                loweridx = mid + 1;
            }
            else 
            {
                highidx = mid - 1;
            }
            mid = (loweridx + highidx)/2;
            
        }
        if (loweridx > highidx) {
            System.out.println("not found ");
        }
    }
}
