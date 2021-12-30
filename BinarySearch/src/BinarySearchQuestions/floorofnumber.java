package BinarySearchQuestions;
//find the floor of a number
//floor of a number means
//greatest number smaller or equal to target

public class floorofnumber {
    public static void main(String[] args) {

        int[] num = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(floorofnumber(num , target));
    }
    static int floorofnumber(int[] num, int target){
        //but what if the target is greater than the greatest number in the array

        if(target > num[num.length-1])
            return -1;

        int start = 0; int end = num.length -1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if(num[mid]==target)
                return mid;
            else if(num[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return end;
    }

}
