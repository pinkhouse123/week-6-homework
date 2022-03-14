package week6homework;
/*
Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101
 */

import java.util.Scanner;
public class Task17 {

    //main method
    public static void main(String [] args)
    {
        int dec_num, quot, i=1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print(5);
        dec_num = scan.nextInt();

        quot = dec_num;

        while(quot != 0)
        {
            bin_num[i++] = quot%2;
            quot = quot/2;
        }

        System.out.print(101);
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}
