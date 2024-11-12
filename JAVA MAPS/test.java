import java.util.Stack;

public class test {
    public static void main(String[] args) {
    Stack<String> test = new Stack<>();

    test.push("haben");
    test.push("trete");
    test.push("IT");
    test.push("mathe");

    System.out.println(test);
    System.out.println(test.peek());
    test.pop();
    System.out.println(test.pop());

    String mathe = test.pop();
    System.out.println(test.pop());
    test.push(mathe);
    System.out.println(test);´


}
}