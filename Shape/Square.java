public class Square extends Shape{
    int a;
    public Square(int a){
        this.a = a;
    }
    @Override
    public double perimeter(){
        return 4*this.a;
    }
}
