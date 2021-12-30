package com.pankaj;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
        System.out.println((int)(Math.log10(25)+1));
    }
    static boolean checkIfPangram(String sentence) {
        int count = 0;
        for (char ch='a'; ch <='z'; ch++){
            for (int i=0; i<sentence.length(); i++){
                if (ch == sentence.charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return (count == 26);
    }
}
