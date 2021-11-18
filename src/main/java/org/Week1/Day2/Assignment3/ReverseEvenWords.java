package org.Week1.Day2.Assignment3;

import java.io.OutputStream;

public class ReverseEvenWords {
    //Build a logic to reverse the even position words (output: I ma a erawtfos tester)

    public static void main(String[] args) {
        String test = "I am a software tester";
        String[] testArr = test.split(" ");
        for(int i=0; i< testArr.length;i++){
            if(i%2 !=0){
                System.out.println("Current odd string in the input is: "+ testArr[i]);
                char[] indArr = testArr[i].toCharArray();
                String ouptut = "";
                System.out.println("Even character in the current string is :");
                for(int j=indArr.length-1; j>=0;j--){
                    if(j%2 == 0){
                        System.out.println(indArr[j]);
                    }else{
                        ouptut = ouptut+ indArr[j] + " ";
                    }
                }
                System.out.println("Odd Characters in Current String are: " + ouptut);
            }
        }
    }
    /*
    c) find the odd index within the loop (use mod operator)

			d)split the words and have it in an array

			e)print the even position words in reverse order using another loop (nested loop)
			f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
     */


}
