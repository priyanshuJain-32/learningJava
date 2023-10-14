public class B extends A{
    public String sem_subjects(){
        return "DBMS, DSA and Programming Concept using Java";
    }
    public static void main(String args[]){
        A obj = new B();
        System.out.println("Current Sem: " + A.current_sem() + "\nSubjects: " + obj.sem_subjects());
    }
}