public class Test1{
    public static void main(String[] args){
        Mammal<Human> m = new Mammal<Human>(new Human());
        m.print();
    }
}