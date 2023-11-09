import java.util.logging.Level;
import java.util.logging.Logger;

public class q1{
    public static void main(String[] args){
        q1someClass obj = new q1someClass();
        obj.logit();
        Logger.getGlobal().log(Level.FINE, "second message");
        Logger.getGlobal().setLevel(Level.OFF);
        try{
            throw new ArithmeticException();
        }
        catch(Exception e){
            Logger.getGlobal().log(Level.SEVERE, "third message");
        }
        finally{
            System.out.println("Chal");
        }
    }
}