public class Main {
    public static void main(String[] args) {


        SlNode root = new SlNode(20);
        root.setNext(new SlNode(10));
        root.getNext().setNext(new SlNode(30));
        root.getNext().getNext().setNext(new SlNode(45));
        root.getNext().getNext().getNext().setNext(new SlNode(90));

        System.out.print(getMiddle(root).getVal());


    }

    public static SlNode reverseSl(SlNode node) {

        SlNode curr = node;
        SlNode tail = null;

        while (curr != null) {
            SlNode next = curr.getNext();
            curr.setNext(tail);
            tail = curr;
            curr = next;
        }
        return tail;
    }

    public static SlNode getNth(SlNode node, int n) {
        int index = 0;
        SlNode current = node;
        while (current != null) {
            if (index == n) {
                return current;
            } else {
                current = current.next;
                index++;
            }
        }
        throw new RuntimeException("Index" + n + " out of bounds.");
    }

    public static SlNode getNthFromLast(SlNode node, int n) {
        SlNode ref = node;
        SlNode main = node;
        for (int i = 0; i <= n; i++) {
            ref = ref.getNext();
        }
        while (ref != null) {
            ref = ref.getNext();
            main = main.getNext();
        }

        return main;

    }

    public static SlNode getMiddle(SlNode node) {
        SlNode fast = node;
        SlNode slow = node;

        while (fast != null) {
            if (fast.getNext() == null) {
                return slow;
            } else {
                fast = fast.getNext();
                slow = slow.getNext();
                if (fast.getNext() == null) {
                    return slow;
                } else {
                    fast = fast.getNext();
                }

            }


        }
        throw new RuntimeException("oops");
    }

    public static void traverseSl(SlNode node) {
        SlNode curr = node;
        while (curr != null) {
            System.out.print(curr.getVal() + " ");
            curr = curr.getNext();
        }
    }

    public static class Pointer {
        public SlNode getCurr() {
            return curr;
        }

        public void setCurr(SlNode curr) {
            this.curr = curr;
        }

        SlNode curr;
        int mSkip;

        public Pointer(SlNode node, int skip) {
            curr = node;
            mSkip = skip;
        }

        public boolean hasNext() {
            SlNode last = curr;
            int i = 0;
            while (i < 1) {
                if (last == null) {
                    return false;
                }
                last = last.getNext();
                i++;
            }
            return last != null;
        }

        public SlNode next() {
            SlNode last = curr;
            int i = 0;
            while (i < mSkip) {
                last = last.getNext();
                i++;
            }
            curr = last;
            return curr;
        }

    }


    public static class SlNode {
        int val;
        SlNode next;

        public SlNode(int val) {
            this.val = val;
        }

        public SlNode getNext() {
            return next;
        }

        public void setNext(SlNode next) {
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }

    public static class DlNode {
        int val;
        DlNode next;
        DlNode prev;

        public DlNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public DlNode getNext() {
            return next;
        }

        public void setNext(DlNode next) {
            this.next = next;
        }

        public DlNode getPrev() {
            return prev;
        }

        public void setPrev(DlNode prev) {
            this.prev = prev;
        }
    }

    public static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getVal());
        preOrder(node.getLeft());
        preOrder(node.getRight());

    }

    public static void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getVal());
    }

    public static void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        System.out.print(node.getVal());
        inOrder(node.getRight());

    }

    public static class Node {
        private int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
