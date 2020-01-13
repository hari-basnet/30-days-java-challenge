package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        // creating a list of Integers
        List<Integer> number = Arrays.asList(2,4,5,6,8,9);
        
        // map
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
    
        System.out.println(square);
    }
}
