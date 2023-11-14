import java.util.stream.Stream;
import java.util.*;
public class FClass{
    int j = 0;
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream().filter(j -> j%2==0);
        stream.forEach(s -> System.out.println(s));

    }
}