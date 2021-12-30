package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr1 = {11 ,12 ,24 ,56 ,89 , 100, 122, 199};

        //Reverse by creating another array but Not good enough;
//        int[] arr2 = new int[arr1.length];
//
//        for (int i=0; i<arr1.length; i++){
//            arr2[i] = arr1[arr1.length - i -1];
//        }
//        System.out.println("Actual Array : "+Arrays.toString(arr1));
//        System.out.println("Reverse of Array : "+Arrays.toString(arr2));

        System.out.println(Arrays.toString(arr1));
        //Reverse by swaping the elements;
        reversible(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void reversible(int[] arr){

       int start = 0;
       int end = arr.length - 1;

       while (start < end){
           swap(arr, start ,end);
           start++;
           end--;
       }
    }

    static void swap(int[] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
