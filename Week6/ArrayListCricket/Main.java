import java.util.*;
class CricketPlayer{
  private String name;
  private int wickets;
  private int runs;
  private int matches;
  public CricketPlayer(String s, int w, int r, int m){
    this.name = s;
    this.wickets = w;
    this.runs = r;
    this.matches = m;
  }
  public String getName(){
    return name;
  }
  public int getWickets(){
    return wickets;
  }
  public int getRuns(){
    return runs;
  }
  public double avgRuns(){
    return runs/matches;
  }
  public double avgWickets(){
    return wickets/matches;
  }
} 
public class Main {
// Define displayPlayers() method here
    static void displayPlayers(ArrayList<CricketPlayer> bw, ArrayList<CricketPlayer> bt){
        // if(bw instanceof CricketPlayer && bt instanceof CricketPlayer){
        //     ArrayList<CricketPlayer> w = new ArrayList<CricketPlayer>(bw);
        //     ArrayList<CricketPlayer> t = new ArrayList<CricketPlayer>(bt);
        // }
        for (int i=0; i<bw.size(); i++) {
            System.out.print(bw.get(i).getName());
        }
        System.out.println();
        for (int j=0; j<bt.size(); j++){
            System.out.print(bt.get(j).getName());
        }
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CricketPlayer p1 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p2 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p3 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());
    CricketPlayer p4 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                sc.nextInt(), sc.nextInt());

    // Define ArrayList objects here
    ArrayList<CricketPlayer> bt = new ArrayList<CricketPlayer>();
    ArrayList<CricketPlayer> bw = new ArrayList<CricketPlayer>();
    
    if (p1.getRuns()>25){
        bt.add(p1);
    }
    if (p1.getWickets()>1){
        bw.add(p1);
    }
    
    if (p2.getRuns()>25){
        bt.add(p2);
    }
    if (p2.getWickets()>1){
        bw.add(p2);
    }
    
    if (p3.getRuns()>25){
        bt.add(p3);
    }
    if (p3.getWickets()>1){
        bw.add(p3);
    }
    
    if (p4.getRuns()>25){
        bt.add(p4);
    }
    if (p4.getWickets()>1){
        bw.add(p4);
    }
    
 displayPlayers(bw, bt);
  }
}  