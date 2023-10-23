public class Test {
    public static void main(String[] args){
       Example<String> n=new Example<String>("Hello");
       Example<Double> e=new Example<Double>(10.5);
       if(n.getClass()==e.getClass()){
           System.out.print(n.show()+"\n"+n.get());
       }
       else{
           System.out.print(e.show()+"\n"+e.get());
       }
    }
}