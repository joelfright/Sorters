import com.sparta.joel.exceptions.ChildNotFoundException;
import com.sparta.joel.exceptions.EmptyArrayException;
import com.sparta.joel.sorters.BubbleSort;
import com.sparta.joel.sorters.MergeSort;
import com.sparta.joel.tree.BinaryTreeImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {

    private final int[] unsortedArray = {1,2,6,4,6,7,1};
    private final int[] sortedArray = {1,1,2,4,6,6,7};
    private final int[] emptyArray = {};

    @Test
    @DisplayName("Empty array BinaryTree")
    public void testEmptyArrayBinary(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(emptyArray);
        Assertions.assertArrayEquals(emptyArray, binaryTree.getSortedTreeAsc());
    }

    @Test
    @DisplayName("Checking for correct output in BubbleSort")
    public void testBubbleSort() throws EmptyArrayException {
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertArrayEquals(sortedArray, bubbleSort.sortArray(unsortedArray));
    }

    @Test
    @DisplayName("Checking for correct output in MergeSort")
    public void testMergeSort() throws EmptyArrayException {
        MergeSort mergeSort = new MergeSort();
        Assertions.assertArrayEquals(sortedArray, mergeSort.sortArray(unsortedArray));
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
    @DisplayName("Test for no child found exception")
    public void checkNoChildFoundException(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binaryTree.getLeftChild(1));
    }

    @Test
    @DisplayName("Test for empty array exception in bubble")
    public void checkEmptyArrayExceptionBubble(){
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertThrows(EmptyArrayException.class, () -> bubbleSort.sortArray(emptyArray));
    }

    @Test
    @DisplayName("Test for empty array exception in bubble")
    public void checkEmptyArrayExceptionMerge(){
        MergeSort mergeSort = new MergeSort();
        Assertions.assertThrows(EmptyArrayException.class, () -> mergeSort.sortArray(emptyArray));
    }

}
