public class Example {
    public static void main(String[] args) {
          try{
               int a=10/0;
          }
          finally{
               System.out.println("Hello Exception");
          }
         catch(Exception e){
               System.out.println(e);
          }
    }
}