public class Test{
    public static void main(String[] args){
        Example<Number> n = new Example<Number>(100);
        Example<Double> e = new Example<Double>(10.5);
        n=e;
        System.out.println(n.show() + "\n" + n.get());
    }
}