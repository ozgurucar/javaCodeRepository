package org.ozgurucar;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    public static int fibonacci(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        return fibonacci(x-2) + fibonacci(x-1);
    }
}
