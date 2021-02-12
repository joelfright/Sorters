package com.sparta.joel.printer;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Printer {

    public static void printIntArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void printString(String text){
        System.out.println(text);
    }

    public static void printTimeResults(long time){
        System.out.println(TimeUnit.NANOSECONDS.toMicros(time) + " microseconds");
    }

    public static void printLine(){
        System.out.println();
    }

    public static void printInt(int value){
        System.out.println(value);
    }

}
