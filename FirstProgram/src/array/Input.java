package array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Array of primitives
//        int[] arr = new int[5];
//
//        for (int i=0; i<arr.length; i++){
//            arr[i] = input.nextInt();
//        }
//
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//        //this is for each loop in java and cpp also;
//        for (int j: arr){ //for every element in the array, print the element
//            System.out.print(j + " "); //here j represent the element of the array;
//        }
//
//    //Now using the Arrays class and toString() method
//        System.out.println(Arrays.toString(arr));

        //Array of objects
        String[] str = new String[4];

        for (int i=0; i<str.length; i++){
            str[i] = input.next();
        }
        //using toString() method
        System.out.println(Arrays.toString(str));

        //using for loop
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }
        //using for each loop
        for (String j:str){ //Note here we have taken j as string type; cuz j is storing the value of str , not the index
            System.out.println(j);
        }


    }
}
