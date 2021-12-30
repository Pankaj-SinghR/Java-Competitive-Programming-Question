package com.pankaj;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class Candies {

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(Arrays.toString(candies));
        System.out.println(Arrays.toString(kidsWithCandies(candies, extraCandies)));
        System.out.println(kidsWithCandies2(candies, extraCandies));
    }
    static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] ans = new boolean[candies.length];
        boolean isMax = true;

        for (int i=0; i<candies.length ;i++){
            int max = candies[i] + extraCandies;
            for (int val : candies) {
               if (max >= val)
                   isMax = true;
               else{
                   isMax = false;
                   break;
               }
            }
            ans[i] = isMax;
        }
        return ans;
    }

    static List<Boolean> kidsWithCandies2(int[] candies, int extraCandies){
        List<Boolean> ans = new ArrayList<>(candies.length);
        int maxcandies = 0;
        for(int val:candies){
            maxcandies = Math.max(maxcandies, val);
        }

        for(int candie:candies){
            ans.add((candie+extraCandies >= maxcandies));
        }

        return ans;
    }

}
