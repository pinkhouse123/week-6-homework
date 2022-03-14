package week6homework;
/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.6 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Task14 {

    // main method
    public static void main(String[] args) {
        double w = 5.6;
        double h = 8.5;

        double area = w * h;
        double perimeter = 2 * (w + h);

        System.out.println((w * h));
        System.out.println(2 * (w + h));


    }
}