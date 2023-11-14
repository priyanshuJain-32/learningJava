import java.util.*;
public class Customer implements Cloneable{
    public String name;
    public Items item;
    public Customer(String name, Items item){
        this.name = name;
        this.item = item;
    }
    public Items getItems(){
        return this.item;
    }
    public void setName(String name){
        this.name = name;
    }
    public Customer clone() throws CloneNotSupportedException{
        Customer cust = (Customer)super.clone();
        cust.item = this.item.clone();
        System.out.println(cust);
        System.out.println(this);
        return cust;
    }
    public String toString(){
        return this.name + " " + this.item;
    }
}