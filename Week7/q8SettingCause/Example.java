public class Example {
    public void show(){
        NullPointerException e = new NullPointerException();
        e.initCause(new ArithmeticException());
        throw e;
    }
    public static void main(String[] args){
        Example object = new Example();
        try{
            object.show();
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(e.getCause());
        }
    } 
}
