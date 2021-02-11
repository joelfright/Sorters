package com.sparta.joel.sorters;

import com.sparta.joel.exceptions.EmptyArrayException;

public class BubbleSort implements Sorter {

    public int[] sortArray(int[] arrayToSort) throws EmptyArrayException {
        int temp;
        boolean swapped;
        if (arrayToSort.length < 1) throw new EmptyArrayException("This array is empty!");

        for(int j = 1; j < arrayToSort.length; j++) {
            swapped = false;
            for (int index = 0; index < arrayToSort.length - j; index++) {
                if (arrayToSort[index] > arrayToSort[index + 1]) {
                    temp = arrayToSort[index];
                    arrayToSort[index] = arrayToSort[index + 1];
                    arrayToSort[index + 1] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        return arrayToSort;
    }

}
