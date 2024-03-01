import java.util.Scanner;

public class Factorialnumber
{
    public static void main(String[] args) {
        int fac = 1;
        System.out.println("Enter any number for factorial");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            fac = fac * i;
        }
        System.out.println(  n +  " number of factorial =  " +fac);
        
    }
}