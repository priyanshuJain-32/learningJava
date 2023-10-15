package Week3.BirdDuck;

public class FClass{
      public void doIt(Bird b){
            b.fly();
            if(b instanceof Duck)
                      ((Duck) b).swim();

     }
     public static void main(String[] args){
            Duck d = new Duck();
            doIt(d);
     }
  }