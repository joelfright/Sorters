package com.sparta.joel.tree;

import com.sparta.joel.exceptions.ChildNotFoundException;

public class BinaryTreeImpl implements BinaryTree{

    Node root;

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
            throw new ChildNotFoundException("No child for this element!");
        }
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        if(root.right != null){
            return root.right.value;
        }else{
            throw new ChildNotFoundException("No child for this element!");
        }

    }

    @Override
    public int[] getSortedTreeAsc() {
        int[] orderedArr = new int[getNumberOfElements()];
        return traverseAsc(root, orderedArr,0);
    }

    @Override
    public int[] getSortedTreeDesc() {
        int[] orderedArr = new int[getNumberOfElements()];
        return traverseDesc(root, orderedArr,getNumberOfElements());

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

    private int[] traverseAsc(Node node, int[] orderedArr, int index){
        if(node != null){
            index++;
            traverseAsc(node.left, orderedArr,index);
            orderedArr[index - 1] = node.value;
            traverseAsc(node.right, orderedArr,index);
        }
        return orderedArr;
    }

    private int[] traverseDesc(Node node, int[] orderedArr, int index){
        if(node != null){
            index--;
            traverseDesc(node.left, orderedArr,index);
            orderedArr[index] = node.value;
            traverseDesc(node.right, orderedArr,index);
        }
        return orderedArr;
    }


}
