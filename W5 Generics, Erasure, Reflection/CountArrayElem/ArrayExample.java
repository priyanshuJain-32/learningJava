class ArrayExample <T>{
  T[] a;
  
// Define constructor(s) as needed
    ArrayExample(T[] x){
        a = x;
    }
  // Define method display() that print the elements of array a 
  void display(){
      for(int i=0; i< a.length; i++){
        System.out.print(a[i] + " ");   
      }
      System.out.println("");
  }
  // Define method elementCount(T x) that 
  // counts the no. of times x is present in the array a
  int elementCount(T x){
      int count = 0;
      for(int i=0; i< a.length; i++){
          if(x.equals(a[i])){
              count++;
          }
      }
      return count;
  }
}