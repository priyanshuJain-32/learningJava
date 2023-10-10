public class Mammal{
    public String name;
    public int lifespan;
    public Mammal(){
        name = "Giraffe";
        lifespan = 45;
    }
    public void show(){
        System.out.println("Giraffe");
        System.out.format("name = %s : lifespan = %d",name,lifespan);
    }
}