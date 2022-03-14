package week6homework;
/*
Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */

public class Task2 {

    //static variable
    static int j = 15;
    static String name = "Umi";

    //static method
    public static void testMethod() {
        System.out.println(j);
        System.out.println(name);

    }

    //main method
    public static void main(String[] args) {
        testMethod();

    }


}




