public class Employee implements Comparable{
    private String name;
    private double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return "{" + name + ":" + salary +"}";
    }
    public int compareTo(Object e){
        Employee d = (Employee)e;
        if(this.salary==d.salary){
            return name.compareTo(d.name);
        }
        else {
            if(d.salary>this.salary){
                return 1;
            }
            else if(d.salary < this.salary){
                return -1;
            }
            else {
                return 0;
            }
        }
    }
}