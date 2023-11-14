 import java.util.stream.*;
     import java.util.*;
public class FClass{
            public static void main(String[] args){
                   var pList = new ArrayList<Product>();
                   pList.add(new Product("Pen", 10.0));
                   pList.add(new Product("Pencil", 5.0));
                   pList.add(new Product("Notebook", 40.0));
                   pList.add(new Product("Eraser", 8.0));
 
                   var outputList = pList.stream().takeWhile(x -> x.getPrice()>=10); //LINE 1
                   outputList.forEach(n -> System.out.println(n));
             }
      }