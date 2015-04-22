package algo.mindepth;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree(100);
        tree.insert(10);
        tree.insert(5);
        tree.insert(70);
        tree.insert(1);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);
        tree.insert(150);
        
        System.out.println(tree.getMinDepth());
        System.out.println(tree.getMinDepthBfs());
    }

}
