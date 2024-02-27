import java.util.*;
public class Stringpalindrome {
    public static void main(String arg[])
    {
     String str = "Madam";
     int i = 0 ;
     int j = str.length()-1;
     int flag = 0;
     while(i<j && flag == 0)
     {
      if(str.charAt(i) != str.charAt(j))
      {
       flag = 1;
       break;
      }
      i++;
      j--;
    if(flag == 0)
    {
     System.out.println("Palindrome String");
    }
    else
    {
    System.out.println("Not Palindrome String");
    }
   }
   }
   }

