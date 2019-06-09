import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {

    private Queue<Integer> q;
    private Stack<Integer> s;

    public ReverseQueueUsingStack(Queue<Integer> queue) {
        this.q = queue;
        this.s = new Stack<>();

    }

    public void reverse() {
        while (!q.isEmpty()) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }

}
