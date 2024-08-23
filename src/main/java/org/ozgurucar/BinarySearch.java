package org.ozgurucar;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sequence = {0, 1, 3, 5, 7, 8, 9};
        System.out.println(binarySearch(sequence,219));

    }

    public static boolean binarySearch(int[] sequence, int number) {
        int len = sequence.length;
        int mid = (len -1 ) / 2;

        if(len == 1) {
            return sequence[0] == number;
        }
        if(sequence[mid] > number) {
            return binarySearch(Arrays.copyOfRange(sequence,0, mid), number);
        }
        else if (sequence[mid] < number) {
            return binarySearch(Arrays.copyOfRange(sequence,mid + 1, len), number);
        } else {
            return true;
        }
    }
}
