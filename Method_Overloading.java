public class Method_Overloading {
    public static void main(String[] args) {
        System.out.println("This is entry point ");
        main("dimpal", 20000);
        Method_Overloading obj = new Method_Overloading();
        obj.main(20000,"dimpal");
    }
     void main(int a)
     {
         System.out.println("Main Method of int Argument");
     }
      static void main(String str,int i)
      {
        System.out.println(" Main Method of 2 arguments");
      }
      int main(int id,String name)
      {
        return id; 
      }
}
