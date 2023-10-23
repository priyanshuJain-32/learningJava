public class Hod extends Faculty {
    public Hod(String name, String dept) {
         super(name, dept);
    }
    public String toString() {
         return "Hod [name=" + getName() + ", dept=" + getDept() + "]";
    }
}