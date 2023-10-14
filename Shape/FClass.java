import static java.lang.Math.*;
import java.util.Arrays;
public class FClass {
    public static void main(String[] args){
        Shape[] shapearr = new Shape[3];
        double[] periarr = new double[3];
        shapearr[0] = new Rectangle(4, 5);
        shapearr[1] = new Square(5);
        shapearr[2] = new Circle(7);
        for (int i=0; i<3; i++){
            periarr[i] = shapearr[i].perimeter();
        }
        System.out.println(Arrays.toString(periarr));
    }
}
