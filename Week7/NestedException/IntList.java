class IntList{
    int[] a = new int[5];
    void set_value(int n, int m) throws InvalidInputEx{
        if (4>=n && n>=0)
        a[n] = m;
        else {
            InvalidInputEx e = new InvalidInputEx("invalid index input");
            e.initCause(new ArrayIndexOutOfBoundsException("Index "+ n +" out of bounds for length 5"));
            throw e;
        }
    }
    int[] getArray(){
        return a;
    }
}