public class Employee implements Verifiable{
    private int id;
    private String name;
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int get_id(){
        return id;
    }
    public String get_name(){
        return name;
    }
    public boolean isEqual(Object d){
        if(d instanceof Employee){
            if(this.id == ((Employee)d).id){
                return true;
            }
            return false;
        }
        return false;
    }
}