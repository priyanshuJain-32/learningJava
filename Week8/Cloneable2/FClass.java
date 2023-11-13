public class FClass {
    public static void main(String[] args){
        try{
            Point p1 = new Point(10,20);
            Point p2 = p1;
            Point p3 = p1.clone();
            p1.setX(100);
            p2.setY(200);
            System.out.println(p1 + "," + p2 + "," + p3);
        }
        catch(CloneNotSupportedException e){
            System.out.println("clone not supported");
        }
    }
}
