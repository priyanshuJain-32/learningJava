// import java.util.*;
class Calculator{
        // Fill the code
        public double sum(double a, double b){ 
            System.out.println(a+b);
            return(a+b); 
        }
        public double subtraction(double a, double b){ 
            System.out.println(a-b);
            return(a-b); 
        }
        public double multiply(double a, double b){ 
            System.out.println(a*b);
            return(a*b); 
        }
        public double division(double a, double b){ 
            if (b!=0){
                System.out.println(a/b);
                return(a/b); 
            } else {
                System.out.println("Invalid division b=0");
                return -1;
            }
        }
    }