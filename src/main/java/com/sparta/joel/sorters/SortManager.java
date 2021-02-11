package com.sparta.joel.sorters;

public class SortManager {

    public Sorter getSorter(Sorts sortType){
        if(sortType == null){
            return null;
        }else if(sortType.equals(Sorts.Merge)){
            return new MergeSort();
        }else if(sortType.equals(Sorts.Bubble)){
            return new BubbleSort();
        }
        return null;
    }

}
