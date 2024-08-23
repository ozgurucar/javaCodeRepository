package org.ozgurucar;

import java.util.Arrays;

public class ArrayFirstTwoElement {
    public static void main(String[] args) {
       int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(firstSecond(myArray)));
    }
    public static int[] firstSecond(int[] arr) {
        int[] temp = new int[2];
        Arrays.sort(arr);
        temp[0] = arr[arr.length -1];
        int i = arr.length -2;
        while(Arrays.asList(temp).contains(arr[i]) == true) {
            i += 1;
        }
        temp[1] = arr[i];

        return temp;
    }
}
