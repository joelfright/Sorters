import com.sparta.joel.exceptions.EmptyArrayException;
import com.sparta.joel.sorters.BubbleSort;
import com.sparta.joel.sorters.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SorterTests {

    private final int[] unsortedArray = {1,2,6,4,6,7,1};
    private final int[] sortedArray = {1,1,2,4,6,6,7};

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

}
