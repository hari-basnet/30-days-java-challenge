package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] integerArray = {3,2,5,4,6,8,1};
        swapCount(integerArray);

    }

    private static void swapCount(int[] array) {
        int numberOfSwaps = 0;

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length -1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    numberOfSwaps++;
                }

                if(numberOfSwaps == 0) {
                    break;
                }
            }

        }

        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[array.length - 1]);
        System.out.println(Arrays.toString(array));
    }
}
