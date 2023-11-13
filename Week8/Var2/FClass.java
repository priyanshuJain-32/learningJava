import javax.swing.border.EmptyBorder;

public class FClass{
    public static void main(String[] args){
        Employee e = new Manager();
        var o1 = e;
        var o2 = new Employee();
        var o3 = new Manager();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }
}