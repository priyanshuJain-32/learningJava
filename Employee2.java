import java.util.*;

class Employee2
{
    String eid;
    String ename;
    String eprojects[];
 //Define all the required methods here
public Employee2(Employee e){
    this.eid = e.eid;
    this.ename = e.ename;
    this.eprojects = e.eprojects.clone();
}
public Employee2(String eid, String ename, String[] eprojects){
    this.eid = eid;
    this.ename = ename;
    this.eprojects = eprojects;
}
public void display(){
    System.out.println("id:" + this.eid);
    System.out.println("name:" + this.ename);
    System.out.println("projects:");
    for (String project: this.eprojects) {
        System.out.print(project);
        System.out.print(":");
    }
}
 
 
 
public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }
    
}
public class FClass
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    	   String project[] = {"P001","P002","P003"};
        //Enter the id of employee
        String id = s.nextLine();
        //Enter the name of employee
        String name = s.nextLine();
        
        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee(e1); 
        //The copy constructor must copy all the data members. 
       
        e1.mutator();
        
        e2.display();
    }
}
