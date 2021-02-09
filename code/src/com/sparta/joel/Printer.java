package com.sparta.joel;

import java.util.Arrays;

public class Printer {

    public static void printIntArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void printString(String text){
        System.out.println(text);
    }

    public static void printErrorMessage(String error){
        System.err.println(error);
    }

    public static void printInt(int num){
        System.out.println(num);
    }

}
