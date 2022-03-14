package week6homework;
/*
Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Task6 {
    //static method
    static Scanner sc = new Scanner(System.in);

    //main method
    public static void main(String [] args) {
        System.out.print("Enter the radius: ");

        double radius = sc.nextDouble();
        //Area A=PI*r*r
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
    }

}
