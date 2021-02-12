package com.sparta.joel.starters;

import com.sparta.joel.exceptions.EmptyArrayException;
import com.sparta.joel.printer.Input;
import com.sparta.joel.printer.Printer;
import com.sparta.joel.sorters.Sorts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Starter {

    public static int[] unsortedArray;
    private static final Logger logger = LogManager.getLogger(Starter.class);

    public static void start(){
        try {
            sortersStart();
        } catch (EmptyArrayException e) {
            logger.error("Empty array!", e);
        } catch (Exception e){
            logger.fatal("Fatal Exception: ", e);
        }
        binaryTreeStart();
    }

    private static void sortersStart() throws EmptyArrayException {
        Printer.printString("Enter a sorter: (bubble (default)/merge) ");
        String sorter = Input.enterString();

        if(sorter.equalsIgnoreCase("merge")){
            Printer.printString("---------------Merge Sort--------------");
            SortRunner.sorters(Sorts.Merge);
        }else{
            Printer.printString("--------------Bubble Sort--------------");
            SortRunner.sorters(Sorts.Bubble);
        }

        Printer.printString("---------------------------------------\n");
    }

    private static void binaryTreeStart(){
        Printer.printString("Binary tree order: (asc (default)/desc) ");
        String ascending = Input.enterString();

        Printer.printString("--------------Binary Tree--------------");
        SortRunner.binaryTree(!ascending.equalsIgnoreCase("desc"));
        Printer.printString("---------------------------------------");
    }

    public static int[] randomiseArray(int size, int lowerBound, int upperBound){
        int[] randomArray = new int[size];
        for(int index = 0; index < size; index++){
            randomArray[index] =(int)(Math.random() * (upperBound - lowerBound + 1) + lowerBound);
        }
        return randomArray;
    }

}
