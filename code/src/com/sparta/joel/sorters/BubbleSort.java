package com.sparta.joel.sorters;

public class BubbleSort implements Sorter {

    public int[] sortArray(int[] arrayToSort){
        int temp;
        boolean swapped;

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
