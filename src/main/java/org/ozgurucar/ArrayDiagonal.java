package org.ozgurucar;

public class ArrayDiagonal {
    public static void main(String[] args) {
    int[][] myArray2D= {{1,2,3,4},{5,6,7,8},{8,9,10,11}};
        System.out.println(diagonal(myArray2D));

    }

    public static int diagonal(int[][] arr) {
        int sum = 0;
        for(int i = 0, j = 0; i < arr.length; i++, j++) {
        sum += arr[i][j];
        }
        return sum;
    }
}
