package array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {11 ,12 ,24 ,56 ,89 ,78};
        System.out.println(Arrays.toString(arr));
        swap(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] num, int fir, int sec){

        int temp = num[fir];
        num[fir] = num[sec];
        num[sec] = temp;

    }


}
