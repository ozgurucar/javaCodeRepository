package org.ozgurucar;

import java.util.Arrays;

public class ArrayFindMissing {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6};
        System.out.println("Missing number: " + findMissingNumberInArray(myArray));
    }

    public static int findMissingNumberInArray(int[] arr) {
        int total = Arrays.stream(arr).sum();
        System.out.println("total : " + total);
        int expectedTotal;
        int lastItem = arr[arr.length-1];
        expectedTotal = (lastItem * (lastItem +1))/ 2;
        System.out.println("expectedTotal: " + expectedTotal);

        return (expectedTotal - total);
    }
}

