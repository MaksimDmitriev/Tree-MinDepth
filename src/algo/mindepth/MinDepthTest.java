package algo.mindepth;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MinDepthTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { fillSingleLeaf(), 0 },
                { fillTwoLeavesBalanced(), 1 },
                { fillLeftSubtree(), 2 },
                { fillBalancedTwoLevels(), 2 },
                { fillRightSubtree(), 2 },
                { fillLeftPath(), 3 },
                { fillRightPath(), 3 }
        });
    }

    private Tree fInput;

    private int fExpected;

    public MinDepthTest(Tree input, int expected) {
        fInput = input;
        fExpected = expected;
    }

    @Test
    public void testRecursive() {
        assertEquals(fExpected, fInput.getMinDepth());
    }
    
    @Test
    public void testBfs() {
        assertEquals(fExpected, fInput.getMinDepthBfs());   
    }

    /*
     *          10
     */
    private static Tree fillSingleLeaf() {
        Tree tree = new Tree(10);
        return tree;
    }
    
    /*
     *          10
     *        /    \
     *       3     13
     */
    private static Tree fillTwoLeavesBalanced() {
        Tree tree = new Tree(10);
        tree.insert(3);
        tree.insert(13);
        return tree;
    }
    
    /*
     *          10
     *         /
     *        3
     *       / \
     *      2   7
     *     /
     *    1
     */
    private static Tree fillLeftSubtree() {
        Tree tree = new Tree(10);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(1);
        return tree;
    }
    

    /*
     *      10
     *        \
     *        14
     *        / \
     *       12  16
     */
    private static Tree fillRightSubtree() {
        Tree tree = new Tree(10);
        tree.insert(13);
        tree.insert(14);
        tree.insert(12);
        tree.insert(16);
        return tree;
    }
    
    /*
     *         10
     *        /  \
     *       7    13
     *      / \   / \
     *     2   9 12  15
     */
    private static Tree fillBalancedTwoLevels() {
        Tree tree = new Tree(10);
        tree.insert(13);
        tree.insert(7);
        tree.insert(2);
        tree.insert(9);
        tree.insert(12);
        tree.insert(15);
        return tree;
    }
    
    /*
     *          10
     *         /
     *        7
     *       /
     *      2
     *     /
     *    1 
     */
    private static Tree fillLeftPath() {
        Tree tree = new Tree(10);
        tree.insert(7);
        tree.insert(2);
        tree.insert(1);
        return tree;
    }
    
    /*
     *         10
     *           \
     *            15
     *              \
     *               17
     *                \
     *                 21
     */
    private static Tree fillRightPath() {
        Tree tree = new Tree(10);
        tree.insert(15);
        tree.insert(17);
        tree.insert(21);
        return tree;
    }

}