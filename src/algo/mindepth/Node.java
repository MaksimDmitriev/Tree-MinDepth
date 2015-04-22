package algo.mindepth;

public class Node {

    int mData;
    Node mLeft;
    Node mRight;

    public Node(int data) {
        mData = data;
    }

    @Override
    public String toString() {
        return Integer.toString(mData);
    }
}
