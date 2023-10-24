public class NumList<T extends Number> implements Iterator{
    private T[] list;
    private int idx;
    public NumList(T[] list){
        this.list = list;
        this.idx = 0;
    }
    public boolean has_next(){
        if(idx < list.length - 1)
        return true;
        return false;
    }
    public Object get_next(){
        idx++;
        return list[idx];
    }
}