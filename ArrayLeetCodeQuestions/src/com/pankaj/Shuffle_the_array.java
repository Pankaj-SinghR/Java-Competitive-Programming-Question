package com.pankaj;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class Shuffle_the_array {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 1};
        int  n = 2;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int i = 0,j = 0;
        while(i < nums.length){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            i += 2;
            j++;
        }
        return ans;
    }
}
