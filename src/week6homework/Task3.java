package week6homework;
/*
Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Task3 {
    int a = 20;//instance variable
    static int b = 30;//static variable

    //instance method
    public void test1() {

        System.out.println(a);//20
        System.out.println(b);//30
    }

    //static method
    static void test2() {
        Task3 obj = new Task3();
        System.out.println(obj.a);//20
        System.out.println(obj.b);//30
    }

    //main method
    public static void main(String[] arg) {
        Task3 ans = new Task3();
        ans.test1();
        test2();

    }
}







