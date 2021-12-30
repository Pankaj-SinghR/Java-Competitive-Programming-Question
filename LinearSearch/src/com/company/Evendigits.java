package com.company;
//
public class Evendigits {
    //Find Numbers with Even number of digits
    public static void main(String[] args) {

        int[] nums = {11, 12, 13, 14, 17, 19, 100, 1, 9, 2, 6751};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num))
                count++;
        }
        
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits2(num);

        if (numberOfDigits % 2 == 0)
            return true;
        else
            return false;
    }
    static int digits(int num){
        int cnt = 0;
        while(num > 0){
            cnt++;
            num = num/10;
        }
        return cnt;
    }
    static int digits2(int num){
        return (int)Math.log10(num)+1;
    }
}
