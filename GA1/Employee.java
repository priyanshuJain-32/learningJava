class Employee extends Person{
    private double salary;
    public Employee(String name, long aadharno, double sal){
        super(name, aadharno);
        this.salary = sal;
    }
    public void print(){
        super.print();
        System.out.println("salary : " + salary);
    }
}