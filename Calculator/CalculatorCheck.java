import java.util.*; 
    public class CalculatorCheck{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            sc.close();
            Calculator c = new Calculator();
            c.sum(n1, n2);
            c.subtraction(n1, n2);
            c.multiply(n1, n2);
            c.division(n1, n2);
            UpdatedCalculator uc = new UpdatedCalculator();
            uc.remainder(n1, n2);
        }
    
    }