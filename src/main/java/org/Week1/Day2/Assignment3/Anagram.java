package org.Week1.Day2.Assignment3;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String text1 = "stops";
        String text2 = "potss";
        boolean isArrayFalse = true;
        if(text1.length() == text2.length()){
            char[] text1Arr = text1.toCharArray();
            char[] text2Arr = text2.toCharArray();
            Arrays.sort(text1Arr);
            Arrays.sort(text2Arr);

            for(int i=0; i< text1Arr.length;i++){
                if(text1Arr[i] != text2Arr[i]){
                    isArrayFalse = false;
                }
            }
        }
        if(!isArrayFalse){
            System.out.println("Both Strings are not equal");
        }else{
            System.out.println("Both Strings are equal");
        }
    }

    /*
	 * Pseudo Code

	 *Declare a String
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss";
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 *
	 */
}
