package com.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Queuey q2 = new Queuey();

        q2.enqueue(2);
        q2.enqueue(3);
        q2.enqueue(4);
        q2.enqueue(5);
        q2.enqueue(6);

        System.out.println(q2.dequeue());
        System.out.println(q2.peek());

        System.out.println("Hello there");


    }
}
