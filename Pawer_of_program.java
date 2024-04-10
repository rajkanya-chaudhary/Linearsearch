public class Pawer_of_program {
    public static void main(String[] args) {
        int base = 2, x = 3;
        System.out.println ("Required Power is " + power (base, x));
      }
      //Recursive Function
      static int power (int base, int x)
      {
        if (x == 0)     //Base Condition
          return 1;
        return (base * power (base, x - 1));
    
    }
}
