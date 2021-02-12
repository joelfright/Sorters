import com.sparta.joel.exceptions.ChildNotFoundException;
import com.sparta.joel.tree.BinaryTreeImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TreeTests {

    private final int[] unsortedArray = {1,2,6,4,6,7,1};
    private final int[] emptyArray = {};

    @Test
    @DisplayName("Empty array BinaryTree")
    public void testEmptyArrayBinary(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(emptyArray);
        Assertions.assertArrayEquals(emptyArray, binaryTree.getSortedTreeAsc());
    }

    @Test
    @DisplayName("Checking for correct output in BinaryTree (Asc)")
    public void testBinaryTreeAsc(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        int[] sortedTree = {1,2,4,6,7};
        binaryTree.addElements(unsortedArray);
        Assertions.assertArrayEquals(sortedTree, binaryTree.getSortedTreeAsc());
    }

    @Test
    @DisplayName("Checking for correct output in BinaryTree (Desc)")
    public void testBinaryTreeDesc(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        int[] sortedTree = {7,6,4,2,1};
        binaryTree.addElements(unsortedArray);
        Assertions.assertArrayEquals(sortedTree, binaryTree.getSortedTreeDesc());
    }

    @Test
    @DisplayName("Check for left node")
    public void checkForLeftNode() throws ChildNotFoundException {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        Assertions.assertEquals(4, binaryTree.getLeftChild(6));
    }

    @Test
    @DisplayName("Check for right node")
    public void checkForRightNode() throws ChildNotFoundException {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        Assertions.assertEquals(7, binaryTree.getRightChild(6));
    }

    @Test
    @DisplayName("Check for element exists")
    public void checkForElementTrue() {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        Assertions.assertTrue(binaryTree.findElement(7));
    }

    @Test
    @DisplayName("Check for element doesn't exist")
    public void checkForElementFalse(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        Assertions.assertFalse(binaryTree.findElement(10));
    }

    @Test
    @DisplayName("Check for number of elements")
    public void checkForNumOfElements(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        Assertions.assertEquals(5, binaryTree.getNumberOfElements());
    }

    @Test
    @DisplayName("Check for root element")
    public void checkForRootElement(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        Assertions.assertEquals(1, binaryTree.getRootElement());
    }

}
