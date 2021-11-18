package org.Week1.Day2.Assignemnt2;

public class FindSecondLargest {
    public static void main(String[] args) {

        // Here is the input
        int[] data = {3,2,11,4,6,7};
        for(int i=0; i<data.length; i++){
            for(int j=i+1; j<data.length; j++){
                if(data[i]>data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        System.out.println(data[data.length-2]);
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */



    }
}
