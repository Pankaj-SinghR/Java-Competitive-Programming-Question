package BinarySearchQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] num = {2, 3, 5, 6, 7, 8, 10 ,11, 12 , 15, 20, 23, 30, 33, 40, 45};
        int target = 15;
//        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(num));
        System.out.println("target "+target);
        System.out.println(find_in_infinite_array(num, target));
    }
    static int find_in_infinite_array(int[] num, int target){
        // first find the range
        // first start with box of size 2
        int start = 0;int end = 1;

        //condition for the target to lie in the range : target > num[end]
        //jab tak mera target element num[end] se bada aata rehega tab tak hum
        //uske size ko badhate rehege

        while(target > num[end]){
            start = end + 1;
            end = 2*start + 1;
        }

        return search(num, target, start, end);
    }
    static int search(int[] num , int target, int start, int end){

            while (start <= end) {
                int mid = start + (end - start)/2 ;

                if (num[mid] == target)
                    return mid;
                else if (target > num[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            return -1;
    }

}
