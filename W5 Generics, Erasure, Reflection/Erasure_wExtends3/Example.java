class Example<T>{
      T ob;
      Example(T x){
        this.ob=x;
   }
   public String show(){
        return ""+ob.getClass().getName();
   }
   public T get(){
        return ob;
   }
}