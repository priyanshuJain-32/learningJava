public class CopyArrayObjects {
    public static <S extends T,T> void copy (S[] src,T[] tgt){
         int i,limit;
         limit = Math.min(src.length,tgt.length);
         for (i = 0; i < limit; i++){
               tgt[i] = src[i];
         }
    }
    public static void main(String[] args) {
         Hod hod1 = new Hod("Johny", "CSE");
         Hod hod2 = new Hod("Jock", "EEE");
         Hod hod3 = new Hod("Nelson", "CE");
         Hod hod[] = {hod1,hod2,hod3};
         Faculty[] members = new Faculty[2];
         CopyArrayObjects.copy(hod, members);
         for (int i = 0; i < members.length; i++) {

         System.out.println(members[i]);
         }
     }
}