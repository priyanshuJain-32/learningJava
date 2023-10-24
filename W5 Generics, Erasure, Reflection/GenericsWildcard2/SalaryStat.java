public class SalaryStat<T extends Employee>{
    private T[] eps;
    public SalaryStat(T[] eps){
        this.eps = eps;
    }
    private double getTotalSalary(){
        double total = 0;
        for(int i=0; i<eps.length; i++){
            total += eps[i].getSalary();
        }
        return total;
    }
    public boolean greaterSalary(SalaryStat<?> d){
        if(this.getTotalSalary() > d.getTotalSalary())
        return true;
        return false;
    }
}