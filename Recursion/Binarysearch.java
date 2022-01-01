import java.util.Arrays;
public class Binarysearch{
    public static void main(String args[]){

        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 8, 0, arr.length-1));
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        
        if (start > end) return -1;
        int mid = start + (end - start)/2;

        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid-1);
        } else {
            return binarySearch(arr, target, mid+1, end);
        }
 
        
    }
}
