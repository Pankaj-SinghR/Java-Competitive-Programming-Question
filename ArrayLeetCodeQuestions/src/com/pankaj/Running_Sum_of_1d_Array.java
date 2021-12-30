package com.pankaj;

//https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));

    }
    static int[] runningSum(int[] nums) {

        for (int i=1; i<nums.length; i++){
            nums[i] =  nums[i]+nums[i-1];
        }

        return nums;
    }
}
