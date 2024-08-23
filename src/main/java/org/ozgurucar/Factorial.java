package org.ozgurucar;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(8));
    }

    public static int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * factorial(--x);
    }
}