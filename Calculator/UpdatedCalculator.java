class UpdatedCalculator extends Calculator{
        // Fill the code
        public double remainder(double a, double b){ 
            if (b!=0){
            System.out.println(a%b);
            return(a%b);
        } else {
            System.out.println("Error b=0");
            return -1;
        }
        }
    }