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
        
        // creating a list of string
        List<String> name = Arrays.asList("Hari", "ram", "Shyam", "Jiban", "Balkrishna");
        
        // filter
        List<String> namesWithCaps = name.stream().filter(x -> x.matches(".*[A-Z].*")).collect(Collectors.toList());
        List<String> filteredNames = name.stream().filter(x -> x.startsWith("S")).collect(Collectors.toList());
    
        System.out.println(namesWithCaps);
        System.out.println(filteredNames);
        
        // sorted
        List<String> sortedNames = name.stream()
                                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                                .sorted()
                                .collect(Collectors.toList());
    
        System.out.println(sortedNames);
        
        int even = number.stream().filter(x -> x%2==0).reduce(0,(ans, i) -> ans + i);
    
        System.out.println(even);
    }
}
