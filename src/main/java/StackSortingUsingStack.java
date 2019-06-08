import java.util.Stack;

public class StackSortingUsingStack {
    Stack<Integer> input;
    Stack<Integer> temp = new Stack();

    public StackSortingUsingStack(Stack input) {
        this.input = input;
        this.temp = new Stack();
    }

    public Stack<Integer> sort() {
        while (!input.empty()) {
            int curr = input.pop();
            if (temp.isEmpty()) {
                temp.push(curr);
            } else {
                while (!temp.isEmpty() && temp.peek() > curr) {
                    input.push(temp.pop());
                }
                temp.push(curr);
            }

        }
        return temp;

    }
}
