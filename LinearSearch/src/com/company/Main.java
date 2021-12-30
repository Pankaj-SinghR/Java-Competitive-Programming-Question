package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = {12, 14, 15, 17, 18, 45};

        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the value: ");

        int target = in.nextInt();
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target)
                    return i;
            }
        }
        return -1;
    }
}

