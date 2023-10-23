public class FClass{
     public static void main(String[] args) {
             OutputList list = new OutputList();
             while(list.has_next()) {
                (list.get_next()).output();
             }
      }
}