package com.sparta.joel;

import com.sparta.joel.sorters.BubbleSort;

public class Starter {

    public static void start(){
        int[] unsortedArray = {0,1,-1,3,5,6,7,5};
        BubbleSort bubbleSort = new BubbleSort();

        if(unsortedArray.length < 1){
            Printer.printErrorMessage("This is an empty array!");
        }else {
            Printer.printString("\nUnsorted Array: ");
            Printer.printIntArray(unsortedArray);
            Printer.printString("\nSorted Array: ");
            Printer.printIntArray(bubbleSort.sortArray(unsortedArray));
        }
    }

}
