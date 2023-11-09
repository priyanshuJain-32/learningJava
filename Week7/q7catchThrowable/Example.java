public class Example{
    public static void main(String[] args){
        String name = "IIT Madras";
        try{
            System.out.println(name.charAt(10));
        }
        catch(Throwable t){
            System.out.println("Throwable");
        }
    }
}