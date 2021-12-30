package BinarySearchQuestions;

public class RotatedBinarySearch {

    public static void main(String[] args) {

        int[] num = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(search(num, target));

    }

    static int search(int[] num, int target){
        int pivot = findPivot(num);
        //if you did not find a pivot, it means the array is not rotated
        if (pivot == -1){
            //just do normal binary search
            return binarySearch(num, target , 0 , num.length -1);
        }
        // if pivot is found , you have found 2 asc sorted arrays

        if (num[pivot] == target) return pivot;

        if (target >= num[0]){
            return binarySearch(num, target, 0 ,pivot-1);
        }

        return binarySearch(num, target ,pivot + 1, num.length-1);
    }

    // this will not work for duplicate values
    static int findPivot(int[] num){
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid < end && num[mid] > num[mid + 1]) //to preserve the index out of bound
                return mid;
            if (mid > start && num[mid] < num[mid - 1])
                return mid - 1;
            //case 3
            if (num[mid] <= num[start]) {
                end = mid - 1;
            } else { //case 4
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start ,int end) {

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else //ans found
                return mid;
        }
        return -1;
    }
    static int findPivotWithDuplicate(int[] num){
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid < end && num[mid] > num[mid + 1]) //to preserve the index out of bound
                return mid;
            if (mid > start && num[mid] < num[mid - 1])
                return mid - 1;

            //if elements at middle, start, end are equal then just skip the duplicates

            if(num[mid] == num[start] && num[mid] == num[end]){
                //skip the duplicate
                //NOTE: what if these elements at start and end were the pivot??
                //check if start is pivot;
                if (num[start] > num[start + 1]) return start;
                start++;
                if (num[end] < num[end - 1]) return end -1;
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(num[start] < num[mid] || (num[start] == num[mid] && num[mid] > num[end])){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

}


