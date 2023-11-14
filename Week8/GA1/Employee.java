class Employee{
    private String name, department;
    private int salary;
    public Employee(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String toString(){
        return this.name + " : " + this.department + " : " + this.salary;
    }
    public String getName(){
        return this.name;
    }
    public String getDepartment(){
        return this.department;
    }
    public int getSalary(){
        return this.salary;
    }
}
