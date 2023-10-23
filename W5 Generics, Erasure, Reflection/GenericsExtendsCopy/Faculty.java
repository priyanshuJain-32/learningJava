public class Faculty {
    private String name;
    private String dept;
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public Faculty(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
    public String toString() {
        return "Faculty [name=" + name + ", dept=" + dept + "]";
    }
}