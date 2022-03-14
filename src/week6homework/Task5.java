package week6homework;
/*
Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */


import java.util.Scanner;

public class Task5 {

    //main method
    public static void main(String [] args) {
        int first, second, add, subtract, multiply;
        float divide;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Two Numbers : ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        divide = (float) first / second;

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);
    }
}