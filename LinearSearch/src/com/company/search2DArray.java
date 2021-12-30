package com.company;

import java.util.Arrays;

public class search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 1, 5},
                {34, 90, 67, 9},
                {12, 56, 89},
                {18, 12}
        };
        int target = 9;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        if (arr.length == 0)
            return new int[]{-1, -1};
        else{
            for (int i=0; i<arr.length; i++){
                for (int j=0; j<arr[i].length; j++){
                    if (arr[i][j] == target)
                        return new int[]{i, j};
                }
        }}
        return new int[]{-1, -1};
    }

}
