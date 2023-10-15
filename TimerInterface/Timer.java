import java.util.*;
public class Timer implements Runnable{
    private Timerowner owner;
    
    public void run(){

    }
    public Timer(Timerowner o){
        owner = o;
    }
    public void start(){
        TimeUnit.SECONDS.sleep(10);
        owner.timerdone();
    }
}