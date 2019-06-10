import java.util.LinkedList;
import java.util.Queue;

public class BTNode {
    int val;
    BTNode left;
    BTNode right;

    public BTNode(int val) {
        this.val = val;
        left = right = null;
    }

    public void levelOrder(BTNode root) {
        Queue<BTNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BTNode curr = queue.poll();
            System.out.println(curr.val);
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }

    }

    public void insertNode(BTNode root, BTNode node) {
        Queue<BTNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BTNode curr = queue.poll();
            if (curr.left == null) {
                curr.left = node;
                break;
            } else {
                queue.add(curr.left);
            }
            if (curr.right == null) {
                curr.right = node;
                break;
            } else {
                queue.add(curr.right);
            }

        }

    }

}
