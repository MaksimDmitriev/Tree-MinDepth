package algo.mindepth;

public class Node {

    int mData;
    Node mLeft;
    Node mRight;

    public Node(int data) {
        mData = data;
    }

    public void setLeft(Node left) {
        mLeft = left;
    }

    public void setRight(Node right) {
        mRight = right;
    }

    @Override
    public String toString() {
        return Integer.toString(mData);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Node)) {
            return false;
        }
        Node other = (Node) obj;
        return mData == other.mData;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + mData;
        return result;
    }
}
