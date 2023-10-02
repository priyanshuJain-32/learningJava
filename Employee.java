import java.util.Scanner;

class Employee{
	    String ename;
	    String eid;
	    String edept;
	    
	    public Employee(){
		        ename = "guest";
	    }
//Define the required methods
        public Employee(String name, String id, String edept){
            this.ename = name;
            this.eid = eid;
            this.edept = edept;
        }
        public void copyDept(Employee e){
            this.edept = e.edept;
        }
        public void displayDetails(){
            System.out.println("ename : " + this.ename);
            System.out.println("eid : " + this.eid);
            System.out.println("edept : " + this.edept);
        }
}
