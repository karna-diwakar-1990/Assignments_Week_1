package org.Week1.Day2.Assignment3;

public class FindTypes {
    public static void main(String[] args) {
        // Here is the input
        String test = "$$ Welcome to 2nd Class of Automation $$ ";

        // Here is what the count you need to find
        int  letter = 0, space = 0, num = 0, specialChar = 0;
        char[] testArr = test.toCharArray();
        for(int i=0; i< testArr.length; i++) {
            if(Character.isLetter(testArr[i])){
                letter = letter+1;
            }else if(Character.isSpaceChar(testArr[i])){
                space = space+1;
            }else if(Character.isDigit(testArr[i])){
                num = num+1;
            }else {
                specialChar = specialChar+1;
            }
        }
		/* Pseudo Code:
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/

        // Print the count here
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("specialCharcter: " + specialChar);


	}
}