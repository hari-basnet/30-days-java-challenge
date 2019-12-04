package com.java;

import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array){
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            int item = array[i];
            System.out.print(item);
            if(i < array.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(String[] array){
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            String item = array[i];
            System.out.print(item);
            if(i < array.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

	public static void main(String[] args) {
	// write your code here

        // initializing arrays

        int[] intArray1;
        int[] intArray2 = new int[4];
        int[] intArray3 = {5, 6,7, 9,8};

        String[] shoppingList = {"bananas", "apples", "pears"};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));

        // custom print array thingy
        Arrays.sort(intArray2);
        printArray(intArray2);
        printArray(intArray3);
        printArray(shoppingList);
        Arrays.sort(shoppingList);
        printArray(shoppingList);

        System.out.println("special for loop: ");
        // special for loop
        for(String s : shoppingList){
            System.out.println(s);
        }

        // printing reverse arrays
        for(int i = shoppingList.length -1; i > -1; i--){
            System.out.print(shoppingList[i]);
        }

	}
}
