package BinarySearchQuestions;
// Find the number of rotation count in the array
public class RotationCount {
    public static void main(String[] args) {

        int[] num = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findpivot(num)+1);
    }
    static int findpivot(int[] num){
        int start = 0;
        int end = num.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;

            if (num[mid] > num[mid+1] && mid < end){
                return mid;
            }
            if (num[mid] < num[mid -1] && mid > start ){
                return mid -1;
            }
            if (num[mid] <= num[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

}
