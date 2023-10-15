

public class Mammal{
public String name;
public int lifespan;

public Mammal(){
                name = "Tiger";
                lifespan = 45;
          }

        public void show() {
               System.out.format("name = %s : lifespan = %d",name,lifespan);
          }
        public void display() {
               System.out.println("Mammal details");
          }
    }
