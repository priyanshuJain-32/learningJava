public class Circle extends Shape{
    int r;
    public Circle(int r){
        this.r = r;
    }
    @Override
    public double perimeter(){
        return 2*Math.PI*this.r;
    }
}
