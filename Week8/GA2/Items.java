import java.util.*;
public class Items implements Cloneable{
    public String[] item;
    public Items(String[] item){
        this.item = item;
        }

    public String[] getItems(){
        return this.item;
    }
    public String toString(){
        String str = ""; 
        for (String s: this.item){
            str += s + " ";
        }
        return str;
    }
    public Items clone() throws CloneNotSupportedException{
        Items clonedItems = (Items) super.clone();
        clonedItems.item = Arrays.copyOf(this.item, this.item.length);
        return clonedItems;
    }
}