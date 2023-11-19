public class Devotee implements Comparable{
    String name;
    int ticket_type;
    Devotee(String p_name, int p_type){
        name = p_name;
        ticket_type = p_type;
    }
    public int compareTo(Object a){
        Devotee d = (Devotee)a;
        if(ticket_type < d.ticket_type){
            return 1;
        }
        else if(ticket_type > d.ticket_type){
            return -1;
        }
        else return 0;
    }
}