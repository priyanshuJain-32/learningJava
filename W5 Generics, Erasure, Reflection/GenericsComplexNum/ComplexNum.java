class ComplexNum<T extends Number>{
    T r;
    T i;
    ComplexNum(T r, T i){
        this.r = r;
        this.i = i;
    }
    ComplexNum<Double> add(ComplexNum<Double> o){
        Double rf = (Integer)(this.r) + (Double)(o.r);
        Double ri = (Integer)(this.i) + (Double)(o.i);
        // ComplexNum<Double> c = new ComplexNum<Double>(rf,ri);
        return new ComplexNum<Double>(rf,ri);
    }
    public String toString(){
        if (this.r instanceof Integer){
            return (this.r.toString() + ".0 + " + this.i.toString() + ".0i");
        }
        return this.r + " + " + this.i + "i";
        
    }
}