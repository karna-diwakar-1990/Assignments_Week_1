package org.Week1;

/**
 * Hello world!
 *
 */
public class Day1
{
    //Week 1 Assignment: Factorial
    public void calculateFactorial(int input){
        int fact = 1;
        for (int i=1;i<=input; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }

    //Week 1 Assignment: Fibonacci Series
    public void printFibonacciSeries(int input){
        int firstNum = 0; int secNum = 1; int sum;
        System.out.println(firstNum);
        for(int i=1; i<=input; i++){
            sum = firstNum + secNum;
            firstNum = secNum;
            secNum = sum;
            System.out.println(firstNum);
        }
    }

    //Week 1 Assignment: Determine Prime Number
    public void isPrimeNumber(int input){
        boolean isPrimeNumber = false;
        for (int i = 2; i <= input / 2; i++) {
            if (input % i == 0) {
                isPrimeNumber = true;
            }
            break;
        }

        if (!isPrimeNumber) {
            System.out.println("Input is a prime number");
        } else {
            System.out.println("Input is not a prime number");
        }
    }

    public static void convertNegativetoPositive(int input){
        int output =0;
        if(isPositiveNumber(input)){
            System.out.println("The entered is a positive integer ");
        }else{
            System.out.println("The entered input is a negative integer. Hence converting it to positive");
            output = input - 2*input;
        }
        System.out.println("After converting enter input: " + input + " it will be: " + output);
    }

    public static boolean isPositiveNumber(int input){
        if(input>0){
            return true;
        }else{
            return false;
        }
    }


    public static void main( String[] args )
    {
        /*Day1 w1 = new Day1();
        w1.isPrimeNumber(5);
        w1.calculateFactorial(5);
        w1.printFibonacciSeries(10);*/
        convertNegativetoPositive(-40);
    }
}
