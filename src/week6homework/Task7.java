package week6homework;
/*
Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Task7 {

    //static method
    public static void test1() {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        float fahrenheit = input.nextFloat();
        double celsius = ((fahrenheit - 32) * 5 / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

    }

    public static void main(String[] arg) { //main method

        test1(); // static method call directly


    }
}
