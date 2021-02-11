import com.sparta.joel.exceptions.EmptyArrayException;
import com.sparta.joel.printer.Printer;
import com.sparta.joel.sorters.BubbleSort;
import com.sparta.joel.sorters.MergeSort;
import com.sparta.joel.tree.BinaryTreeImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PerformanceTests {

    private final int[] unsortedArray = {1,2,6,4,6,7,1};

    @Test
    @DisplayName("BubbleSort speed")
    public void testSpeedBubbleSort() throws EmptyArrayException {
        BubbleSort bubbleSort = new BubbleSort();
        long start = System.nanoTime();
        bubbleSort.sortArray(unsortedArray);
        long end = System.nanoTime();
        Printer.printTimeResults(end - start);
    }

    @Test
    @DisplayName("MergeSort speed")
    public void testSpeedMergeSort() throws EmptyArrayException {
        MergeSort mergeSort = new MergeSort();
        long start = System.nanoTime();
        mergeSort.sortArray(unsortedArray);
        long end = System.nanoTime();
        Printer.printTimeResults(end - start);
    }

    @Test
    @DisplayName("BinaryTree speed")
    public void testSpeedBinaryTree(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        long start = System.nanoTime();
        binaryTree.getSortedTreeAsc();
        long end = System.nanoTime();
        Printer.printTimeResults(end - start);
    }

}
