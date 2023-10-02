import java.util.*;
public class SeriesSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//Fill your code here
    
    int sum = 0, j = n;
    for (int i=1; i<n+1; i++) {
        sum += j*i*i;
        System.out.println(i +" " + j + " " + sum);
        j--;
    }
System.out.println(sum); 
  }
}