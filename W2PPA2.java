import java.util.*;
class W2PPA2 {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    evenDisplay(s1);
  }
  public static void evenDisplay(String s){
    
    for (int i=0; i<s.length(); i+=2) {
        
        System.out.print(s.substring(i,i+1));
    
    }
  }
}
