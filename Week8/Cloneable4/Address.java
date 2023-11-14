public class Address implements Cloneable{
      private int houseno;
      private String city;
      public Address(int houseno, String city) {
          this.houseno = houseno;
          this.city = city;
      }
     public void updateAddress(int houseno, String city) {
         this.houseno = houseno;
         this.city = city;
     }
     public String toString() {
         return houseno + " : " + city;
     }
     public Address clone() throws CloneNotSupportedException{
         return (Address)super.clone();
     }
}