package com.company;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Pankaj Singh";
        char target = 'g';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
        //change string into character array using str.toCharArray() method
        //find character at particular index using str.charAt(index) method
    }
    static boolean search(String str, char target){
        if (str.length() == 0)
            return false;
        else{
            for (int i=0; i<str.length(); i++){
                if (str.charAt(i) == target)
                    return true;
            }
        }
        return false;
    }
}
