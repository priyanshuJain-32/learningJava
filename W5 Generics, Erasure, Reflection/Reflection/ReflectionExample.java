import java.lang.reflect.*;
public class ReflectionExample {
      public static void main(String[] args) {
            Class c=new Human().getClass();
            Constructor[] constructors=c.getConstructors();
            Method[] methods=c.getMethods();
            Field[] fields=c.getFields();
            System.out.println("Number of methods: "+methods.length);
            System.out.println("Number of constructors: "+constructors.length);
            System.out.println("Number of fields: "+fields.length);
            for (int i=0; i<methods.length; i++){
                  System.out.println(methods[i]);
            }
      }
}
