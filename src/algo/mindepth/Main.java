package algo.mindepth;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree(100);
        tree.insert(10);
        tree.insert(8);
        tree.insert(14);
        tree.insert(6);
        tree.insert(9);
        tree.insert(12);
        tree.insert(15);
        tree.insert(11);
        tree.insert(13);
        
        System.out.println(tree.getMinDepth());
        System.out.println(tree.getMinDepthBfs());
    }

}
