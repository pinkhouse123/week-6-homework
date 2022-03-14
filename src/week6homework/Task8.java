package week6homework;
/*
Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class Task8 {

    //instance method
    public void area(float j, float s) {

        float ans = j * s;

        System.out.println(j * s / 2);
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Calculation");
        Scanner scanner = new Scanner(System.in);//scanner class
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        Task8 obj2 = new Task8(); //object creation
        obj2.area(a, b);

    }


}
