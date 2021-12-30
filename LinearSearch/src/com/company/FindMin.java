package com.company;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12, 13, 6, -10, 18, 23, 56, 34};

        System.out.println(Arrays.toString(arr));
        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
    }
    static int findMin(int[] arr){
        int min = arr[0];
        for (int elem : arr) {
            if (min > elem){
                min = elem;
            }
        }
        return min;
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for (int elem : arr) {
            if (max < elem){
                max = elem;
            }
        }
        return max;
    }

}
