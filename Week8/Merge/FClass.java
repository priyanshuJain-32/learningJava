import java.util.*;
    public class FClass{
           public static void main(String[] args){
                  Map<String, Integer> order1 = new TreeMap<String, Integer>();
                  order1.put("Pen", 3);
                  order1.put("Pencil", 10);
                  order1.put("Notebook", 4);
                  order1.put("Paper", 50);
                  Map<String, Integer> order2 = new TreeMap<String, Integer>();
                  order2.put("Pencil", 20);
                  order2.put("Eraser", 5);
                  order2.put("Paper", 10);
                  order2.put("Pen", 7);
                  Map<String, Integer> totalSell = new TreeMap<String, Integer>();

                  for(Map.Entry<String, Integer> e : order1.entrySet())
                        totalSell.put(e.getKey(), e.getValue());
         
                  for(Map.Entry<String, Integer> e : order2.entrySet())
                        totalSell.merge(e.getKey(), e.getValue(), (x, y) -> y + x);

                  System.out.println(totalSell);
           }
     }