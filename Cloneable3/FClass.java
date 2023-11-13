public class FClass{
    public static void main(String[] args){
        try{
            Product p1 = new Product("Pen", 10);
            Product p2 = new Product(p1);
            Product p3 = p1;
            Product p4 = p1.clone();
            p1.setProdname("Pencil");
            p1.setProdprice(100);
            System.out.println(p1 + "," + p2 + "," + p3 + "," + p4);
        }
        catch(CloneNotSupportedException e){
            System.out.println("Clone() not supported");
        }
    }
}