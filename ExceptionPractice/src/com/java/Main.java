package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
            try{
                int N = Integer.parseInt(S);
                System.out.println(N);
            }catch(Exception e){
                System.out.println("Bad String");
            }
    }
}
