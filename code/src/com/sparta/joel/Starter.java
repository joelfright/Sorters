package com.sparta.joel;

import com.sparta.joel.exceptions.EmptyArrayException;
import com.sparta.joel.sorters.BubbleSort;
import com.sparta.joel.sorters.MergeSort;

public class Starter {

    public static void start(){
        int[] unsortedArray = {0,1,-1,3,5,6,7,5};

        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();

        if(unsortedArray.length < 1){
            try {
                throw new EmptyArrayException("This array is empty!");
            } catch (EmptyArrayException e) {
                e.printStackTrace();
            }
        } else {
            Printer.printString("\nUnsorted Array: ");
            Printer.printIntArray(unsortedArray);
            Printer.printString("\nSorted Array: ");
            Printer.printIntArray(mergeSort.sortArray(unsortedArray));
        }

    }

}
