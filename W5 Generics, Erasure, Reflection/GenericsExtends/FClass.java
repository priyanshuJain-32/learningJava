public class FClass{
    // All four work.
    public static <T extends Verifiable,S extends T> boolean findEmployee(T[] arr, S m){
    // public static <T extends Employee, S extends T> boolean findEmployee(T[] arr, S m){
    // public static <T, S extends Verifiable> boolean findEmployee(T[] arr, S m){
    // public static <T, S extends Employee> boolean findEmployee(T[] arr, S m){        
        for(int i=0; i<arr.length; i++){
            if(m.isEqual(arr[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Employee[] emps = {new Employee(101,"Darpan"),
            new Employee(102,"Ananya"), 
            new Employee(103, "Binita"),
            new Employee(104, "Jairaj"),
            new Employee(105, "Ishaan")};
        Manager m = new Manager(108, "Binita", "IIT");
        System.out.println(findEmployee(emps, m));
    }
}