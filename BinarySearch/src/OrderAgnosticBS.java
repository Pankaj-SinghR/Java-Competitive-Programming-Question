public class OrderAgnosticBS {

    public static void main(String[] args) {

        int[] arr = {-18, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45}; //sorted array
        int target = 4;

        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
    static int binarySearch(int[] arr, int target){
        //check if its ascending order sorted or descending order sorted;
        int start = 0;
        int end =  arr.length-1;

        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            //  find the middle element
            // int mid = (start + end) / 2; //might be possible that (start + end) exceed the limit
            //of integer
            int mid = start + (end - start)/2; //better approach

            if (arr[mid] == target)
                return mid;

            if (isAsc){
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }else{
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;

    }


}
