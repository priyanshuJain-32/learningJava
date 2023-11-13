public class Point implements Cloneable{
    int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public Point clone() throws CloneNotSupportedException{
       return (Point)super.clone();
    }
}
