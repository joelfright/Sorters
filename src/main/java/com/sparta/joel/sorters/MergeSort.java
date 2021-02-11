package com.sparta.joel.sorters;

import com.sparta.joel.exceptions.EmptyArrayException;

public class MergeSort implements Sorter{

    public int[] sortArray(int[] arrayToSort) throws EmptyArrayException {

        if (arrayToSort.length < 1) throw new EmptyArrayException("This array is empty!");
        sort(arrayToSort, 0, arrayToSort.length - 1);
        return arrayToSort;

    }

    public void sort(int[] arrayToSort, int left, int right){

        if(left < right){
            int middle = left + (right - left) / 2;

            sort(arrayToSort,left,middle);
            sort(arrayToSort,middle+1,right);

            merge(arrayToSort, left, middle, right);
        }

    }

    public void merge(int[] arrayToSort, int left, int middle, int right){

        int lengthArr1 = middle - left + 1;
        int lengthArr2 = right - middle;

        int[] leftArray = new int[lengthArr1];
        int[] rightArray = new int[lengthArr2];

        for(int i = 0; i < lengthArr1; i++){
            leftArray[i] = arrayToSort[left + i];
        }
        for(int j = 0; j < lengthArr2; j++){
            rightArray[j] = arrayToSort[middle + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = left;
        while (i < lengthArr1 && j < lengthArr2) {
            if (leftArray[i] <= rightArray[j]) {
                arrayToSort[k] = leftArray[i];
                i++;
            } else {
                arrayToSort[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < lengthArr1) {
            arrayToSort[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < lengthArr2) {
            arrayToSort[k] = rightArray[j];
            j++;
            k++;
        }

    }

}
