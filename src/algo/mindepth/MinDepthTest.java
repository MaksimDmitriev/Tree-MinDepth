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
                { fillTestTree(), 1 }
        });
    }

    private Tree fInput;

    private int fExpected;

    public MinDepthTest(Tree input, int expected) {
        fInput = input;
        fExpected = expected;
    }

    @Test
    public void test() {

        assertEquals(fExpected, fInput.getMinDepth());
    }

    private static Tree fillTestTree() {
        Tree tree = new Tree(100);
        tree.insert(10);
        tree.insert(5);
        tree.insert(70);
        tree.insert(1);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);
        tree.insert(150);
        return tree;
    }

}