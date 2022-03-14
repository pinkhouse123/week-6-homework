package week6homework;
/*
Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Task1 {
    int a = 10;
    int b = 20;

    //main method
    public static void main(String[] args) {
        Task1 ans = new Task1();
        System.out.println(ans.a);//10
        System.out.println(ans.b);//20
    }

    //instance method
    public void recall() {

        System.out.println(a);//10
        System.out.println(b);//20
    }


}
