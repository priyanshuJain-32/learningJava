import java.util.*;
import java.util.concurrent.ExecutorCompletionService;
public class FClass{
    public static void main(String[] args){
        TreeSet<Employee> emplist = new TreeSet<Employee>();
        emplist.add(new Employee("raj", 30000.00));
        emplist.add(new Employee("akash", 60000.00));
        emplist.add(new Employee("biraj", 60000.00));
        emplist.add(new Employee("vinay", 40000.00));
        for(Employee e: emplist){
            System.out.println(e);
        }
    }
}