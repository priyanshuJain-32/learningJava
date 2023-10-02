public class W2GA3
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    	   String project[] = {"P001","P002","P003"};
        //Enter the id of employee
        String id = s.nextLine();
        //Enter the name of employee
        String name = s.nextLine();
        
        Employee2 e1 = new Employee2(id,name,project);
        Employee2 e2 = new Employee2(e1); 
        //The copy constructor must copy all the data members. 
       
        e1.mutator();
        
        e2.display();
    }
}
