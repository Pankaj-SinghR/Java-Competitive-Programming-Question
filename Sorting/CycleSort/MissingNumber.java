import java.util.Arrays;

public class MissingNumber{
    //Given an array nums containing n distinct numbers in the range [0, n]
    //, return the only number in the range that is missing from the array.
    public static void main(String[] args){
        
        //int[] nums = {1, 2};
        int[] nums = {3, 0, 1};
        //int[] nums = {0,1};
        //int[] nums = {9,6,4,2,3,5,7,0,1};
        //int[] nums = {0};
        
        System.out.println(Arrays.toString(nums));
        //first sort the array
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));//sorted array
        //now find the missing number
        System.out.println(findMissing(nums));
    }
    static int findMissing(int[] nums){
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i)
                return i;
        }
        
        return nums.length;
    }
    static void cyclicSort(int[] nums){
        
        int i = 0;
        int n = nums.length;
        while(i < n){
            int correct = nums[i];
            if (nums[i]< nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }
    
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


}
