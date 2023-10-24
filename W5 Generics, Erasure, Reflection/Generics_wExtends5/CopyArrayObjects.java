public class CopyArrayObjects{
    public static <S extends T,T> void copy(S[] src, T[] tgt){
        int i, limit;
        limit = Math.min(src.length, tgt.length);
        for(i=0; i<limit; i++){
            tgt[i] = src[i];
        }
    }
}