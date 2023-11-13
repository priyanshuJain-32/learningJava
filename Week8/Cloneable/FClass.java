public class FClass{
    public static void main(String[] args){
        try{
            ComplexNum c1 = new ComplexNum(10, 20);
            ComplexNum c2 = c1;
            ComplexNum c3 = (ComplexNum)c1.clone();
            c1.setRe(100);
            c1.setIm(200);
            System.out.println(c1 + "," + c2 + "," + c3);
        }
        catch(CloneNotSupportedException e) {
            System.out.println("clone() not supported");
        }
    }
}