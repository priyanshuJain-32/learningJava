public class OutputList implements Iterable{
     private final int max_limit = 2;
     private int indx;
     private Object[] oArr = {new Printer(), new Monitor()};
     public OutputList(){
               indx = -1;
     }
     public boolean has_next() {
              if (indx < max_limit - 1)
                   return true;
              return false;
     }
     public Object get_next() {
              indx++;
              return oArr[indx];
     }
}
