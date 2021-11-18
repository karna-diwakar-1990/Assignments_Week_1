package org.Week1.Day2.Assignemnt1;

public class MyCalculator {
    public static void main(String[] args) {
        Calculator calc= new Calculator();
        System.out.println("Addition Result : "+ calc.add(1,2,3));
        System.out.println("Subtraction Result : "+ calc.sub(1,2));
        System.out.println("Multiplication Result : "+ calc.mul(1,2));
        System.out.println("Division Result : "+ calc.div(1,2));
    }
}
