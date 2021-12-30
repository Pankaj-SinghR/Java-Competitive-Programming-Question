package BinarySearchQuestions;

import java.util.Arrays;

public class firstandlastoccurence {
    public static void main(String[] args){

        int[] num = {5, 7, 7, 7, 7, 8, 8, 10, 11};
        int target = 7;
        System.out.println(Arrays.toString(num));
        System.out.println("Target: "+target);
        System.out.println(Arrays.toString(first_last_occur(num, target)));

    }
    static int[] first_last_occur(int[] nums, int target){
        int[] ans = {-1,-1};

        //check for first occurrence of target first
        ans[0] = search( nums , target, true);
        ans[1] = search( nums, target, false);

        return ans;
    }
    static int search(int[] nums, int target ,boolean findthestart) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                ans = mid; //potential answer found
                if (findthestart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

}
