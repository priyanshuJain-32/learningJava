public class FClass{
        public static void main(String[] args){
              new Parent().f1();
            //   ((Child)new Parent()).f1();
              new Child().f1();
              ((Parent)new Child()).f1();
    }
}