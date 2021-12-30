package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        //Why we need array list?
        //When we don't know the size of array is being taken input. It is same as the vectors in c++

        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//
//        list.add(45);
//        list.add(29);
//        list.add(23);
//        list.add(2380928);
//        list.add(45);
//        list.add(29);
//        list.add(23);
//        list.add(2380928);
//        list.add(45);
//        list.add(29);
//        list.add(23);
//        list.add(2380928);
//
//        System.out.print(list+" ");
//        System.out.println("\n"+list.size());
//
//        //some method in arraylist
//        System.out.println(list.contains(23));
//        System.out.println(list.contains(8980));
//        list.set(0, 13);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);

        //Input

        for (int i=0; i<5; i++){
            list.add(in.nextInt());
        }

        for (int i=0; i<5; i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println(list);

    }
}
