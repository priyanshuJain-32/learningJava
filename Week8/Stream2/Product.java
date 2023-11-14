
     public class Product{
            private String name;
            private double price;
            public Product(String n, double p){
                   name = n;
                   price = p;
            }
            public double getPrice(){
                   return price;
            }
            public String toString(){
                   return name + " : " + price;
            }
     }