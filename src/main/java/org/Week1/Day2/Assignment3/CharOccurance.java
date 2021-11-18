package org.Week1.Day2.Assignment3;

public class CharOccurance {

    public static void main(String[] args) {
        // Check number of occurrences of a char (eg 'e') in a String

        String str = "welcome to chennai";

        // declare and initialize a variable count to store the number of occurrences
        int count = 0;
        // convert the string into char array
        char[] strArr = str.toCharArray();
        //get the length of the array
        int strLength = str.length();
        // traverse from 0 till the array length
        for(int i = 0; i< strLength; i++){
            char test = 'e';
        // Check the char array has the particular char in it
        if(test == strArr[i]){
            count = count+1;
        // if is has increment the count
        }
        }
        // print the count out of the loop
        System.out.println(count);
    }
}
