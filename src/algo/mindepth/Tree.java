package algo.mindepth;

import java.util.LinkedList;

public class Tree {

    private final Node mRoot;

    public Tree(int data) {
        mRoot = new Node(data);
    }

    public void insert(int data) {
        Node root = mRoot;
        while (((root.mData > data) ? (root.mLeft) : (root.mRight)) != null) {
            root = ((root.mData > data) ? (root.mLeft) : (root.mRight));
        }
        if (root.mData > data) {
            root.mLeft = new Node(data);
        } else {
            root.mRight = new Node(data);
        }
    }

    public int getMinDepth() {
        return getMinDepth(mRoot);
    }

    private int getMinDepth(Node root) {

    }

    public int getMinDepthBfs() {
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(mRoot);
        queue.add(null);
        int depth = 0;
        while (!queue.isEmpty()) {
            Node head = null;
            while ((head = queue.remove()) != null) {
                if (head.mLeft == null && head.mRight == null) {
                    return depth;
                }
                if (head.mLeft != null) {
                    queue.add(head.mLeft);
                }
                if (head.mRight != null) {
                    queue.add(head.mRight);
                }
            }
            queue.add(null);
            depth++;
        }

        return depth;
    }
}
