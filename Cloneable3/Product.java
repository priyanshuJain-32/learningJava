public class Product implements Cloneable{
    private String prodname;
    private double prodprice;
    public Product(String name, double price){
        this.prodname = name;
        this.prodprice = price;
    }
    public Product(Product p){
        this.prodname = p.prodname;
        this.prodprice = p.prodprice;
    }
    public void setProdname(String name){
        this.prodname = name;
    }
    public void setProdprice(double price){
        this.prodprice = price;
    }
    public String toString(){
        return "(" + this.prodname + "," + this.prodprice + ")";
    }
    public Product clone() throws CloneNotSupportedException{
        return (Product)super.clone();
    }
}