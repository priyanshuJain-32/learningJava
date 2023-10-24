public class Player{
    private String name;
    private String type;
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public Player(String name, String type){
        this.name = name;
        this.type = type;
    }
    public String toString(){
        return "Player [name=" + name + ",type=" + type + "]";
    }
}