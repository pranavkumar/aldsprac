import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack {
        Queue<Integer> q1;
        Queue<Integer> q2;

        public Stack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        public void push(int i) {
            q1.add(i);
        }

        public int pop() {
            if (q2.isEmpty()) {
                while (!q1.isEmpty()) {
                    int curr = q1.poll();
                    System.out.println("polled " + curr);
                    q2.add(curr);
                }
            }
            return q2.poll();
        }

    }

}
