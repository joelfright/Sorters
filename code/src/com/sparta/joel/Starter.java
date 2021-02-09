package com.sparta.joel;

import com.sparta.joel.exceptions.EmptyArrayException;
import com.sparta.joel.sorters.BubbleSort;
import com.sparta.joel.sorters.MergeSort;
import com.sparta.joel.tree.BinaryTreeImpl;

public class Starter {

    private static final int[] unsortedArray = {0,1,3,5,6,7,5};

    public static void start(){

        binaryTree();

    }

    private static void sorters(String sort){
        if (unsortedArray.length < 1) {
            try {
                throw new EmptyArrayException("This array is empty!");
            } catch (EmptyArrayException e) {
                e.printStackTrace();
            }
        }
        if(sort.equals("bubble")) {
            BubbleSort bubbleSort = new BubbleSort();
            Printer.printString("\nUnsorted Array: ");
            Printer.printIntArray(unsortedArray);
            Printer.printString("\nSorted Array: ");
            Printer.printIntArray(bubbleSort.sortArray(unsortedArray));
        }
        if(sort.equals("merge")){
            MergeSort mergeSort = new MergeSort();
            Printer.printString("\nUnsorted Array: ");
            Printer.printIntArray(unsortedArray);
            Printer.printString("\nSorted Array: ");
            Printer.printIntArray(mergeSort.sortArray(unsortedArray));
        }

    }

    private static void binaryTree(){
        Printer.printString("\nUnsorted Tree: ");
        Printer.printIntArray(unsortedArray);
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.addElements(unsortedArray);
        Printer.printString("\nSorted Tree: ");
        Printer.printIntArray(binaryTree.getSortedTreeAsc());
    }

}
