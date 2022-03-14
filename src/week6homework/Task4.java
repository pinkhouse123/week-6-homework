package week6homework;
/*      Write a Java programme using the following steps.
        4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Task4 {
    //instance variable
    int a = 10;
    int b = 20;

    //static variable
    static String name = "Umi";
    static String age = "22";

    //instance method
    public void myTest1() {
        System.out.println(a);//10
        System.out.println(b);//20
    }

    //static method
    public static void myTest2() {

        Task4 obj = new Task4();
        System.out.println(name);//Umi
        System.out.println(age);//22

    }

    //main method
    public static void main(String[] args) {
        Task4 value = new Task4();
        value.myTest1();

        myTest2();
    }


}
