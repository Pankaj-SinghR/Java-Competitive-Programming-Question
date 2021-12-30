package array;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6};

//Note: There is only call by value in java;cuz there is no pointers in java there is only reference concept
        //This shows that arrays are mutable in java;
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));


        //This shows that strings are immutable in java
//       String name = "Pankaj is my name";
//       System.out.println(name);
//       congesting(name);
//       System.out.println(name);
    }

    static void change(int[] arr){
        arr[0] = 100;
    }
    static void congesting(String str){
        str = "new string";
        System.out.println(str);


    }
}
