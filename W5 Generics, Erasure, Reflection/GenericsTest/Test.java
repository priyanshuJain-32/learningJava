public class Test {
    public static void main(String[] args){
        Repository<Character> a = new Repository<Character>();
        a.push('A');
        System.out.println(a.pop());
        System.out.println((int)'A');
    }
}
