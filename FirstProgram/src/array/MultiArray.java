package array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {9, 10, 12}
        };
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

//        System.out.println(arr[0].length);

        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++){

                System.out.print(arr[row][col]+" ");

            }
        }



    }
}
