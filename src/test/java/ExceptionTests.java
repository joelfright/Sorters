import com.sparta.joel.exceptions.ChildNotFoundException;
import com.sparta.joel.exceptions.EmptyArrayException;
import com.sparta.joel.sorters.BubbleSort;
import com.sparta.joel.sorters.MergeSort;
import com.sparta.joel.tree.BinaryTreeImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExceptionTests {

    private final int[] unsortedArray = {1,2,6,4,6,7,1};
    private final int[] emptyArray = {};

    @Test
    @DisplayName("Test for no child found exception")
    public void checkNoChildFoundExceptionLeft(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binaryTree.getLeftChild(1));
    }

    @Test
    @DisplayName("Test for no child found exception")
    public void checkNoChildFoundExceptionRight(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binaryTree.getRightChild(7));
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
