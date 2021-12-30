package BinarySearchQuestions;
// Given an array num which consists of non-negative integers m, you can split the array into
// m non-empty continuous subarrays
// write an algorithm to minimize the largest sum among these m subarrays.

public class SplitArray {
    public static void main(String[] args) {

        int[] num = {7, 2, 5, 10, 8};
        int m = 2;

        System.out.println(SplitArrays(num, m));

    }
    static int SplitArrays(int[] nums, int m){
        int start = 0;
        int end = 0;

        for (int i=0; i< nums.length; i++){
            start = Math.max(start, nums[i]); //in the end this will contain the maximum element of the array
            end += nums[i]; // this will contain the maximum sum of the array
        }

        //binary search
        while (start < end){
            //try for the middle for the potential answer;
            int mid = start + (end - start)/2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num: nums) {
                if (sum + num > mid) {
                    //you cannot add this in this subarray, make new one
                    //say you add this nums in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
                if (pieces > m){
                    start = mid + 1;
                } else {
                    end = mid;
                }

        }
        return end;// here start == end

    }
}
