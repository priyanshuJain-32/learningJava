public class NumData{
    private Number n;
    public NumData(Number n){
        this.n = n;
    }
    public String getMetaInfo(){
        if (n instanceof Integer){
            return "Integer type, value = " + n;
        }
        else if(n instanceof Double){
            return "Double type, value = " + n;
        }
        else if(n instanceof Character){
            return "Characted type, value = " + n;
        }
        else {
            return "Number type, value = " + n;
        }
    }
}