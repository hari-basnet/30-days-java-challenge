package com.java;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
	// write your code here
        // English to spanish dictionary
        Map<String, String> engSpanDictionary = new HashMap<String, String>();

        engSpanDictionary.put("Monday", "Lunes");
        engSpanDictionary.put("Tuesday", "Martes");
        engSpanDictionary.put("Wednesday", "Miercoles");
        engSpanDictionary.put("Thursday", "Jueves");
        engSpanDictionary.put("Friday", "Viernes");
        engSpanDictionary.put("Saturday", "Sabado");
        engSpanDictionary.put("Sunday", "Domingo");

        // retrieve things from our dictionary
        System.out.println(engSpanDictionary.get("Monday"));
        System.out.println(engSpanDictionary.get("Friday"));

        // print out all keys
        System.out.println(engSpanDictionary.keySet());

        // print our all values
        System.out.println(engSpanDictionary.values());

        // print out size
        System.out.println("The size of our dictionary is: " + engSpanDictionary.size());

        System.out.println();
        System.out.println();


        // shopping list
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();

        // put some stuff in the dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Egg", Boolean.FALSE);
        shoppingList.put("Sugar", false);

        // retrieve item
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));

        // print key value pairs
        System.out.println(shoppingList.toString());

        // remove some items or all
        shoppingList.remove("Eggs");


        // Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());

        //
        shoppingList.clear();
        System.out.println();


    }
}
