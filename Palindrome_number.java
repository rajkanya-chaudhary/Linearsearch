public class Palindrome_number {
    public static void main(String[] args) {
        int a = 11211;
        int sum = 0,n,c,rev;
        c = a;
        while (a>0) {
            rev = a % 10;
            sum = (sum * 10) + rev;
            a = a / 10;  
        }
        if(c==sum)
        {
            System.out.println("palindrome number");
        }
        else
        {
            System.out.println("not palindrome  number");
        }

    }
}
