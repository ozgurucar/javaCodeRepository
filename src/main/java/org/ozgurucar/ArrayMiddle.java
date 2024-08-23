package org.ozgurucar;

import java.util.Arrays;

public class ArrayMiddle {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};

        System.out.println(Arrays.toString(middle(myArray)));
    }

    public static int[] middle(int[] myArray) {
        int[] tempArray = new int[myArray.length - 2];
        for(int i = 1,j = 0; i < myArray.length - 1 && j < myArray.length - 2; i++, j++){
            tempArray[j] = myArray[i];
        }
        return tempArray;
    }
}
