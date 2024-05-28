/**
 * StackDemo28
 */
public class StackDemo28 {

    public static void main(String[] args) {
        Stack28 stack = new Stack28(10);
        stack.push(0);
        stack.push(12);
        stack.push(10);
        stack.print();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.push(-5);
        stack.print();
    }
}