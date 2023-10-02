public class W2GA2 
{
	    public static void main(String args[]) 
	    {
		        Scanner s = new Scanner(System.in);
		        Employee e1 = new Employee();
		
		        //Enter name of the employee
		        String name = s.nextLine();
		
		        //Enter id of the employee
		        String id = s.nextLine();
		
		        //Enter department of the employee
		        String dept = s.nextLine();
		
		        Employee e2 = new Employee(name,id,dept);
		
		        e1.copyDept(e2); 
		        //Copies the department name of e2 into e1's department name.
		
		        e1.displayDetails();
	    }
}
