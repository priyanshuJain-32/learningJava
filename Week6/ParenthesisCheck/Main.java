import java.util.*;

public class Main{
    public static boolean balanceCheck(String expr) {
//Write your code here
    // static void balanceCheck(String expr){
        Stack<String> stack = new Stack<String>();
        for (int i=0; i<expr.length(); i++){
            String temp = expr.substring(i,i+1);
            if(temp.equals("(") || temp.equals("{") || temp.equals("[")){
                stack.push(temp);
            }
            if (temp.equals("}")){
                if(stack.size()==0 || !stack.pop().equals("{")){
                    return false;
                }
            }
            if (temp.equals(")")){
                if(stack.size()==0 || !stack.pop().equals("(")){
                    return false;
                }
            }
            if (temp.equals("]")){
                if(stack.size()==0 || !stack.pop().equals("[")){
                    return false;
                }
            }
            
        }
        if (stack.size()!=0){
            return false;
        }
        return true;
    }
}
   
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        ArrayList<String> expr_arr= new ArrayList<String>();
        String inp=null;
        
        do {
            inp = s.nextLine();
            if(!inp.equalsIgnoreCase("Done"))
                expr_arr.add(inp);
        }while(!inp.equalsIgnoreCase("Done"));

        for(String expr : expr_arr) {
            if(balanceCheck(expr)) {
                System.out.println("Balanced");
            }
            else {
                System.out.println("Not Balanced");
            }
        }
    }
}     