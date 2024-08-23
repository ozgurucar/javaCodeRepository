package org.ozgurucar;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRemoveDuplicates {
    public static void main(String[] args) {
    int[] myArray = {1, 1, 2, 2, 3, 4, 5, 7, 7, 7, 7};
        System.out.println(Arrays.toString(removeDuplicates(myArray)));
    }
    public static int[] removeDuplicates(int[] arr) {
        ArrayList<Integer> removed = new ArrayList<Integer>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if(!removed.contains(current)) {
                removed.add(arr[i]);
            }
        }
        return removed.stream().mapToInt(value -> value).toArray();
    }
}
