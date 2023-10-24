public class FClass{
    public static double sum(NumList<? extends Number> IOB){
        double total = 0;
        while(IOB.has_next()){
            total += ((Number)IOB.get_next()).doubleValue();
        }
        return total;
    }
    public static void main(String[] args){
        Integer[] i_arr = {10, 20, 30, 40, 59};
        Double[] d_arr = {3.44, 2.65, 6.44, 1.3, 6.78};
        NumList<Integer> i_list = new NumList<Integer>(i_arr);
        NumList<Double> d_list = new NumList<Double>(d_arr);
        System.out.println(sum(i_list) + "," + sum(d_list));
    }
}