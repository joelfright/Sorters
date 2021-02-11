package com.sparta.joel.sorters;

import com.sparta.joel.exceptions.EmptyArrayException;

public interface Sorter {

    int[] sortArray(int[] arrayToSort) throws EmptyArrayException;

}

