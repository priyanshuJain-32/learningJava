import java.util.*;
import java.util.stream.*;


class FClass{
    //define method query
    public static ArrayList<Employee> query(ArrayList<Employee> eList, String d, double s){
        ArrayList<Employee> arr = new ArrayList<Employee>();
        for(Employee e: eList){
            if (e.getDepartment().equals(d)){
                if (e.getSalary() >= s){
                    arr.add(e);
                }
            }
        }
        return arr;
    }    
    
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var eList = new ArrayList<Employee>();
        eList.add(new Employee("Jack", "HR", 30000));
        eList.add(new Employee("Aria", "HR", 40000));
        eList.add(new Employee("Nora", "IT", 50000));
        eList.add(new Employee("Bella", "IT", 60000));
        eList.add(new Employee("Jacob", "IT", 70000));
        eList.add(new Employee("James", "HR", 80000));
        String d = sc.next();       //read department
        double s = sc.nextInt();    //read salary
		
        var st = query(eList, d, s);
        st.forEach(n -> System.out.println(n + " "));
    }
}
