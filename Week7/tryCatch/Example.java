public class Example {
      public static void main(String[] args) {
            int a=10,b=0;
            try{
                int c=a/b;
                System.out.println("Quotient is "+c);
            }
            catch (String ae){
                 System.out.println("B value should not be zero");
           }
      }
}