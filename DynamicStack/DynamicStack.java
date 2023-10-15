public class DynamicStack implements StackIter{
    private int[] stack;
    private int tos;

    // Give this stack an initial size and contruct it
    DynamicStack(int size){
        stack = new int[size];
        tos = -1;
    }

    // Implement push with size check and increment
    public void push(int item){
        if (tos == this.stack.length-1){
            int[] temp = new int[this.stack.length*2];
            for (int i=0; i< this.stack.length; i++){
                temp[i] = this.stack[i];
            }
            this.stack = temp;
            this.stack[++tos] = item;
        } else {
            this.stack[++tos] = item;
        }
    }
    public int pop(){
        if (tos < 0){
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return this.stack[tos--];
        }
    }
}