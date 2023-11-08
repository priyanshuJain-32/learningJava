public class Example{
      public static void main(String args[]) {
            int i=0, sum=0;
            try {
                 sum = 10;
                 for (i = -1; i < 3 ;i++)
                        System.out.println(i);

            }
            catch(ArithmeticException e) {
                   System.out.println("0");
            }
      }
}