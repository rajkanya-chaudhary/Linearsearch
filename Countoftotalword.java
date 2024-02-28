import java.util.Scanner;

public class Countoftotalword {
    public static void main(String[] args) {
        String str = new String();
        System.out.println("Enter any String check for count word ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int i , count = 1;
        for(i= 0;i<str.length()-1;i++)
        {
            char c , d;
            c = str.charAt(i);
            d = str.charAt(i+1);
            if(c == ' ' && d != ' ')
            {
                count++;

            }
        }
        System.out.println("Total count of String  = " + count);

        
    }
    
}
