public class ComplexNum implements Cloneable{
    private double r,i;
    public ComplexNum(double r, double i){
        this.r = r;
        this.i = i;
    }
    public void setRe(double r){
        this.r = r;
    }
    public void setIm(double i){
        this.i = i;
    }
    public String toString(){
        return "(" + r + "+" + i + "i)";
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}