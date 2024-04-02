public class binarysearch1 {
    public static void main(String[] args) {
        int arr[] = {1,3,5,8,9,12,16};
        int key = 23;
        int loweidx = 0;
        int highidx =  arr.length-1;
        int Mididx = (loweidx + highidx)/2;
        while (loweidx <= highidx) {
            if(arr[Mididx] == key)
            {
                System.out.println("element is at "  +  Mididx  +  "  index position");
                break;
            }
            else if(arr[Mididx] < key)
            {
                loweidx = Mididx + 1;
            }
            else
            {
                highidx = Mididx -  1;
            }
            Mididx = (loweidx + highidx)/2;
        } 
        if(loweidx > highidx)
        {
            System.out.println("elemnet is not found in this array ");
        }

    }
}
