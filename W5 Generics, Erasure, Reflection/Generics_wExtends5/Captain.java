public class Captain extends Player{
    public Captain(String name, String type){
        super(name, type);
    }
    public String toString(){
        return "Captain [name=" + getName() + ",type=" + getType() + "]";
    }
}