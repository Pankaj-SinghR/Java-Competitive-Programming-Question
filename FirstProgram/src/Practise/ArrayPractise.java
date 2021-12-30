package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractise {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 1-D array
        //Syntax
//        int[] arr = new int[10];
//
//        for (int i=0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        // 2-D array
//        //Syntax
//        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 8},
//                {9, 10, 11, 19, 21, 23}
//        };
//
//        for (int i = 0; i< arr.length; i++){
//            for (int j = 0; j<arr[i].length; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//        }


        //Arraylist
        //syntax
//        ArrayList<Integer> list = new  ArrayList<>();

        //syntax for 2d arraylist

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //This is only the declaration
        //Now This is initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
        System.out.println(list.size());

//
//        //reverse the array using swap method;
//        int arr[] = {11, 12, 13, 14, 15, 16};
//
//        System.out.println(Arrays.toString(arr));
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//

//    }
//
//    static void reverse(int[] arr){
//        int start = 0; int end = arr.length - 1;
//
//        while (start < end){
//            swap(arr, start, end);
//            start++;
//            end--;
//        }
//    }
//    static void swap(int[] arr, int start, int end){
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//    }
//


    }
}