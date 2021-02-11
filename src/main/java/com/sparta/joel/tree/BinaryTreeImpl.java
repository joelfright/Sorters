package com.sparta.joel.tree;

import com.sparta.joel.exceptions.ChildNotFoundException;
import com.sparta.joel.starters.SortRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class BinaryTreeImpl implements BinaryTree{

    public static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    private Node root;
    private final ArrayList<Integer> sortedList = new ArrayList<>();
    private static final Logger logger = LogManager.getLogger(SortRunner.class);

    @Override
    public int getRootElement() {
        return root.value;
    }

    @Override
    public int getNumberOfElements() {
        return countElementsRecursive(root);
    }

    @Override
    public void addElement(int element) {
        root = addElementRecursive(root, element);
    }

    @Override
    public void addElements(int[] elements) {
        for(int element : elements){
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        return containsElementRecursive(root,value);
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        if(root.left != null){
            return root.left.value;
        }else{
            logger.error("No child found");
            throw new ChildNotFoundException("No child for this element!");
        }
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        if(root.right != null){
            return root.right.value;
        }else{
            logger.error("No child found");
            throw new ChildNotFoundException("No child for this element!");
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        sortedList.clear();
        traverseRight(root);
        return sortedList.stream().mapToInt(i -> i).toArray();
    }

    @Override
    public int[] getSortedTreeDesc() {
        sortedList.clear();
        traverseLeft(root);
        return sortedList.stream().mapToInt(i -> i).toArray();
    }

    private Node addElementRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(value < current.value){
            current.left = addElementRecursive(current.left, value);
        }else if(value > current.value){
            current.right = addElementRecursive(current.right, value);
        }else{
            return current;
        }

        return current;
    }

    private boolean containsElementRecursive(Node current, int value){
        if(current == null){
            return false;
        }
        if(value == current.value){
            return true;
        }
        if(value < current.value){
            return containsElementRecursive(current.left, value);
        }else{
            return containsElementRecursive(current.right, value);
        }
    }

    private int countElementsRecursive(Node current) {
        if (current == null) {
            return 0;
        }

        return 1 + countElementsRecursive(current.left) + countElementsRecursive(current.right);
    }

    private void traverseLeft(Node node){
        if(node != null){
            traverseLeft(node.right);
            sortedList.add(node.value);
            traverseLeft(node.left);
        }
    }

    private void traverseRight(Node node){
        if(node != null){
            traverseRight(node.left);
            sortedList.add(node.value);
            traverseRight(node.right);
        }
    }

}
