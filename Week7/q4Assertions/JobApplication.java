public class JobApplication {
    private int age;
    public JobApplication(int age){
        assert age >= 18: "Invalid age for job";
        this.age = age;
    }    
}
