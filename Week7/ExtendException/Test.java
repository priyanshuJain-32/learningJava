import java.util.Scanner;

import javax.lang.model.element.ModuleElement.DirectiveVisitor;

public class Test {
    static int divide(int a, int b) throws DivisionException{
        try {
            if (b!=3)
                return a/b;
            DivisionException e = new DivisionException();
            throw e;
        }
        catch (DivisionException e){
            System.out.println(1);
            return 0;
            
        } finally {
            System.out.println(3);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
        
            divide(x, y);
        }
        catch (DivisionException e){
            System.out.println(2);
        }
    }
}