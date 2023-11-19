import java.util.*;

public class SpecialQueue {
    public static void main(String[] args){
        Devotee[] dev_arr = new Devotee[]{new Devotee("Pavya",0),
            new Devotee("Arya",100), new Devotee("Sana",0),
            new Devotee("Meenu",0), new Devotee("Naina",100)};
        PriorityQueue<Devotee> specialQ = new PriorityQueue<Devotee>();
        for (int i=0; i<5; i++){
            specialQ.add(dev_arr[i]);
        }
        for (int i=0; i<5; i++){
            Devotee d = specialQ.poll();
            System.out.println(d.name + " " + d.ticket_type);
        }
    }
}
