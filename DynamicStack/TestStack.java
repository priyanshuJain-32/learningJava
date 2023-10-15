public class TestStack {
    public static void main(String[] args){
        DynamicStack s1 = new DynamicStack(6);
        DynamicStack s2 = new DynamicStack(10);

        for (int i=0; i<6; i++){
            s1.push(i);
        }
        for (int j=0; j<18; j++){
            s2.push(j);
        }

        for (int i=0; i<6; i++){
            System.out.println(s1.pop());
        }
        for (int j=0; j<20; j++){
            System.out.println(s2.pop());
        }
    }    
}