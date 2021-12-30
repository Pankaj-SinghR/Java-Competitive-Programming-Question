package com.company;

public class RichestWealthPerson {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {3, 7},
                {3, 5}
        };
        System.out.println(findRichest(accounts));
    }

    static int findRichest(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (max < sum)
                max = sum;
        }
        return max;
    }

}