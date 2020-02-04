import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // ConcurrentLinkedDeque much better to use in place of stack
        Stack<String> stack = new Stack<>();

        stack.push("Tomatoes");
        stack.push("Carrots");
        stack.push("Cucumbers");

        while(!stack.isEmpty()){

            System.out.println("veggie = " + stack.pop());
        }

    }
}
