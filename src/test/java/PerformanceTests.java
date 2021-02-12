import com.sparta.joel.exceptions.EmptyArrayException;
import com.sparta.joel.printer.Printer;
import com.sparta.joel.sorters.BubbleSort;
import com.sparta.joel.sorters.MergeSort;
import com.sparta.joel.starters.Starter;
import com.sparta.joel.tree.BinaryTreeImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class PerformanceTests {

    private final int[] sortedArray = {1,2,4,6,7};
    private final int[] unsortedArray = {1,2,6,4,6,7,1};
    private final int[] unsortedArrayLong = Starter.randomiseArray(1000,1,3000);

    @Test
    @Order(1)
    @DisplayName("Average case BubbleSort")
    public void averageCaseBubbleSort() throws EmptyArrayException {
        BubbleSort bubbleSort = new BubbleSort();
        long start = System.nanoTime();
        bubbleSort.sortArray(unsortedArray);
        long end = System.nanoTime();
        Printer.printString("BubbleSort speed: (average): ");
        Printer.printTimeResults(end - start);
        Printer.printLine();
    }

    @Test
    @Order(2)
    @DisplayName("Average case MergeSort")
    public void averageCaseMergeSort() throws EmptyArrayException {
        MergeSort mergeSort = new MergeSort();
        long start = System.nanoTime();
        mergeSort.sortArray(unsortedArray);
        long end = System.nanoTime();
        Printer.printString("Mergesort speed: (average): ");
        Printer.printTimeResults(end - start);
        Printer.printLine();
    }

    @Test
    @Order(3)
    @DisplayName("Average case BinaryTree")
    public void averageCaseBinaryTree(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        long start = System.nanoTime();
        binaryTree.getSortedTreeAsc();
        long end = System.nanoTime();
        Printer.printString("BinaryTree speed: (average): ");
        Printer.printTimeResults(end - start);
        Printer.printLine();
    }

    @Test
    @Order(1)
    @DisplayName("Load case BubbleSort")
    public void loadCaseBubbleSort() throws EmptyArrayException {
        BubbleSort bubbleSort = new BubbleSort();
        long start = System.nanoTime();
        bubbleSort.sortArray(unsortedArrayLong);
        long end = System.nanoTime();
        Printer.printString("BubbleSort speed (load): ");
        Printer.printTimeResults(end - start);
        Printer.printLine();
    }

    @Test
    @Order(2)
    @DisplayName("Load case MergeSort")
    public void loadCaseMergeSort() throws EmptyArrayException {
        MergeSort mergeSort = new MergeSort();
        long start = System.nanoTime();
        mergeSort.sortArray(unsortedArrayLong);
        long end = System.nanoTime();
        Printer.printString("Mergesort speed: (load): ");
        Printer.printTimeResults(end - start);
        Printer.printLine();
    }

    @Test
    @Order(3)
    @DisplayName("Load case BinaryTree")
    public void loadCaseBinaryTree(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArrayLong);
        long start = System.nanoTime();
        binaryTree.getSortedTreeAsc();
        long end = System.nanoTime();
        Printer.printString("BinaryTree speed: (load): ");
        Printer.printTimeResults(end - start);
        Printer.printLine();
    }

    @Test
    @Order(1)
    @DisplayName("Best case BubbleSort")
    public void bestCaseBubbleSort() throws EmptyArrayException {
        BubbleSort bubbleSort = new BubbleSort();
        long start = System.nanoTime();
        bubbleSort.sortArray(sortedArray);
        long end = System.nanoTime();
        Printer.printString("BubbleSort speed (best): ");
        Printer.printTimeResults(end - start);
        Printer.printLine();
    }

    @Test
    @Order(2)
    @DisplayName("Best case MergeSort")
    public void bestCaseMergeSort() throws EmptyArrayException {
        MergeSort mergeSort = new MergeSort();
        long start = System.nanoTime();
        mergeSort.sortArray(sortedArray);
        long end = System.nanoTime();
        Printer.printString("Mergesort speed: (best): ");
        Printer.printTimeResults(end - start);
        Printer.printLine();
    }

    @Test
    @Order(3)
    @DisplayName("Best case BinaryTree")
    public void bestCaseBinaryTree(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(sortedArray);
        long start = System.nanoTime();
        binaryTree.getSortedTreeAsc();
        long end = System.nanoTime();
        Printer.printString("BinaryTree speed: (best): ");
        Printer.printTimeResults(end - start);
        Printer.printLine();
    }

}
