package com.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BinaryChallenge {
    // not exactly binary calculator but calculate decimal to binary and find max consecutive 1s
    // in that binary number
    public static void binaryCalculator(int n ){

        int count = 0;
        int tempCount = 0;
        while(n > 0){
            int remainder = n % 2;
            n = n/2;
//            System.out.println(n);
            if(remainder == 1){
                tempCount++;
                if(tempCount > count){
                    count = tempCount;
                }
                else{
                    tempCount = 0;
                }
            }

        }
        System.out.println(count);
    }


    // lambda way of doing things
    static int longestConsecutiveOneBitSequence(int n){
        return IntStream
                .of(n)
                .mapToObj(Integer::toBinaryString)
                .map(binStr -> binStr.split("0+"))
                .flatMap(Arrays::stream)
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }

    // to review
    /*new BufferedReader(new InputStreamReader(System.in))
            .lines() // Strings
	.mapToInt(Integer::parseInt) // String -> int
	.mapToObj(Integer::toBinaryString) // int -> String
	.map(binStr -> binStr.split("0+")) // String -> String[]
            .flatMap(Arrays::stream) // back to Stream
	.mapToInt(String::length) // String -> int
	.max() // ints -> int
	.ifPresent(System.out::println);*/

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
	// write your code here

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

//        binaryCalculator(n);
        System.out.println(longestConsecutiveOneBitSequence(n));
    }
}


