public class TaxReturn {
    private double income;
    public TaxReturn(int income){
        assert income >= 100000: income;
        this.income = income;
    }    
}
