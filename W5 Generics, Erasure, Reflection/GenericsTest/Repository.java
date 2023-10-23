class Repository<T>{
    T var;
    void push(T v){
        var = v;
    }
    T pop(){
        return var;
    }
}