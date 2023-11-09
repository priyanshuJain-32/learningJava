package MultipleLogger.in.ac.iitm.onlinedegree;
import java.util.logging.*;
public class SomeClass{
      private final static Logger logbook = Logger.getLogger("in.ac.iitm");
      public void doIt(){
           logbook.warning("start of doIt() in in.ac.iitm");
           logbook.setLevel(Level.OFF);
           logbook.warning("end of doIt() in in.ac.iitm");
      }
}