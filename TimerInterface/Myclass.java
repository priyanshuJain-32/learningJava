public class Myclass
    implements Timerowner{
        public void f(){
            System.out.println("Initiatlizing the timer");
            Timer t = new Timer(this);
            t.start();
        }
        public void timerdone(){
            System.out.println("Timer is done");
        }
}