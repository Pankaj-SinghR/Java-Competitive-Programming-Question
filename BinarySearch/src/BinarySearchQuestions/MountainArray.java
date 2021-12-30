package BinarySearchQuestions;

//Find the peak index in the mountain array;

public class MountainArray {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 5, 6, 7, 7, 4, 3, 2};

        System.out.println(peakindex(num));
        System.out.println(peakindex2(num));
    }
    static int peakindex(int[] num){

        int start = 0;
        int end = num.length -1;

        while (start < end){
            int mid = start + (end - start)/2;

            if (num[mid] > num[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;

    }
    static int peakindex2(int[] num){

        int start = 0;
        int end = num.length -1;
        while(start < end){
            int mid = start + (end - start)/2;

            if (num[mid] > num[mid+1]){
                //you are in dec part of the array
                //this may be ans, but look at left
                //this is why end != mid -1;
                end = mid;
            }else{
                start = mid + 1; //cuz mid + 1 element is greater then mid element;
            }
        }
//in the end , start == end and pointing to the largest number.
        return start;//or end can also be return;
    }

}
