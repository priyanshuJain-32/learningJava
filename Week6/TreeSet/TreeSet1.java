import java.util.*;
public class TreeSet1{
    public static void main(String[] args){
        TreeSet<String> set1 = new TreeSet<String>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");
        set1.add("E");
        set1.add("E");
        set1.add("F");
        set1.add("G");
        System.out.println(set1);
    }
}