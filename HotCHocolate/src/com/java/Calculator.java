package com.java;

public class Calculator {
    static int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }

        // any number's power 0 is 1
        if (p == 0) {
            return 1;
        }

        // any power of 0 is 0
        if (n == 0) {
            return 0;
        }
        int result = (int) Math.pow(n, p);
        return result;

    }
}
