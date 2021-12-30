package BinarySearchQuestions;

public class SearchInMountain {

    public static void main(String[] args) {

        int[] num = {1, 2, 4, 5, 3, 1};
        int target = 3;
        System.out.println(searchinmountain(num, target));

    }

    static int searchinmountain(int[] num, int target) {

        int peakindex = findpeakindex(num);

        int valueindex = binarySearch(num, target, 0, peakindex); // first find the ascending part of the array

        if (valueindex == -1) // if not found in ascending part then find in descending part of array
            valueindex = binarySearch(num, target, peakindex + 1, num.length - 1);

        return valueindex;
    }

    static int findpeakindex(int[] num) {

        int start = 0;
        int end = num.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (num[mid] > num[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; //we can also return end here ,cuz while loop will break when start == end;
    }

    static int binarySearch(int[] num, int target, int start, int end) {

        boolean isAsc = num[start] < num[end];

        while (start <= end) {
            //  find the middle element
            // int mid = (start + end) / 2; //might be possible that (start + end) exceed the limit
            //of integer
            int mid = start + (end - start)/2; //better approach

            if (num[mid] == target)
                return mid;

            if (isAsc) {
                if (target < num[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > num[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;

    }
}