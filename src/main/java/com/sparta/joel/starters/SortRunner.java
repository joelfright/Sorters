package com.sparta.joel.starters;

import com.sparta.joel.exceptions.ChildNotFoundException;
import com.sparta.joel.exceptions.EmptyArrayException;
import com.sparta.joel.printer.Input;
import com.sparta.joel.printer.Printer;
import com.sparta.joel.sorters.SortManager;
import com.sparta.joel.sorters.Sorts;
import com.sparta.joel.tree.BinaryTreeImpl;

import static com.sparta.joel.starters.Starter.unsortedArray;
import static com.sparta.joel.starters.Starter.randomiseArray;

public class SortRunner {


    static final BinaryTreeImpl binaryTree = new BinaryTreeImpl();

    public static void sorters(Sorts sortType) throws EmptyArrayException {
        unsortedArray = randomiseArray(10,1,20);

        SortManager sortManager = new SortManager();

        Printer.printString("\nUnsorted Array: ");
        Printer.printIntArray(unsortedArray);

        Printer.printString("\nSorted Array: ");
        Printer.printIntArray(sortManager.getSorter(sortType).sortArray(unsortedArray));
    }

    public static void binaryTree(boolean ascending) throws ChildNotFoundException {

        unsortedArray = randomiseArray(10,1,20);

        Printer.printString("\nUnsorted Tree: ");
        Printer.printIntArray(unsortedArray);

        binaryTree.addElements(unsortedArray);

        Printer.printString("\nSorted Tree: ");
        if(ascending){
            Printer.printIntArray(binaryTree.getSortedTreeAsc());
        }else{
            Printer.printIntArray(binaryTree.getSortedTreeDesc());
        }

        binaryTreeTraverse(binaryTree.getRootElement());
    }

    public static void binaryTreeTraverse(int element) throws ChildNotFoundException {
        Printer.printLine();
        Printer.printString("Traverse left or right (L / R):");
        String choice = Input.enterString();
        if(!binaryTree.findElement(binaryTree.getLeftChild(element))){
            Printer.printString("End of tree");
        }else{
            if (choice.equalsIgnoreCase("L")) {
                Printer.printInt(binaryTree.getLeftChild(element));
                binaryTreeTraverse(binaryTree.getLeftChild(element));
            } else {
                Printer.printInt(binaryTree.getRightChild(element));
                binaryTreeTraverse(binaryTree.getRightChild(element));
            }

        }
    }

}
