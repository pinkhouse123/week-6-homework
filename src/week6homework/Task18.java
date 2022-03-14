package week6homework;
/*
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

public class Task18 {
    int j = 125;
    int v = 24;
    public void operation(){ //instance  variable
        System.out.println(j+v);//149
        System.out.println(j-v);//101
        System.out.println(j*v);//3000
        System.out.println(j/v);//5
        System.out.println(j%v);//5
    }

    public static void main(String[] args) { //main method
        Task18 obj = new Task18(); //object creation
        obj.operation();
    }
}