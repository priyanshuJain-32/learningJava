import java.util.*;

public class FClass{
     public static void main(String[] args) {
               Map<Integer, Character> entries = new TreeMap<Integer, Character>();
               entries.put(30, 'b');
               entries.put(40, 'a');
               entries.put(20, 'd');
               entries.put(10, 'c');
               Collection <Character> values = entries.values();
               for(Character c : values)
                    System.out.print(c + " ");
     }
}