public class Rectangle extends Shape {
    public int l, b;
    public Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    @Override
    public double perimeter(){
        return 2*(this.l + this.b);
    }
}
