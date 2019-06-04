import java.util.Stack;

public class QueueUsingStack {
    static class Queue {
        private Stack<Integer> s1;
        private Stack<Integer> s2;

        public Queue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void enqueue(int i) {
            s1.push(i);
        }

        public int dequeue() {
            if (s2.isEmpty()) {
                if (s1.isEmpty()) {
                    throw new RuntimeException("Queue is empty");
                }
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

    }


}
