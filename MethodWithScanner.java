// import the Scanner class
import java.util.Scanner;

public class App1 {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        //int sum = add();
        //System.out.println("The sum is: " + sum);

        // Method call
        //int difference = subtract();
        //System.out.println("The difference is: " + difference);

       // int product = mulitiply();
        //System.out.println("The product is: " + product);

       // int quotient = divide();
        //System.out.println("The product is: " + quotient);

  

        String crushName = revealMyCrush();
        System.out.println(crushName);

        scan.close();
    }

    // static int add() {
    //     System.out.println("Please enter two numbers to add");
    //     System.out.print("Enter first number: ");
    //     int x = scan.nextInt();

    //     System.out.print("Enter second number: ");
    //     int y = scan.nextInt();
    //     return x + y;
    // }

    // static int subtract() {
    //     System.out.println("Please enter two numbers to subtract");
    //     System.out.print("Enter first number: ");
    //     int x = scan.nextInt();

    //     System.out.print("Enter second number: ");
    //     int y = scan.nextInt();
    //     return x - y;
    // }

    // static int mulitiply(){
    //     System.out.println("Please enter two numbers to multiply");
    //     System.out.print("Enter first number: ");
    //     int x = scan.nextInt();


    //     System.out.print("Enter second number: ");
    //     int y = scan.nextInt();
    //     return x * y;
    // }

    // static int divide(){
    //     System.out.println("Please enter two numbers to divide");
    //     System.out.print("Enter first number: ");
    //     int x = scan.nextInt();

    //     System.out.print("Enter second number: ");
    //     int y = scan.nextInt();
    //     return x / y; 



    // }

    static String revealMyCrush() {
        System.out.println("This will reveal the name of your crush");
        System.out.println("This will reveal the name of your second crush");

        System.out.print("Enter the your name: ");
        String myName = scan.nextLine();

        System.out.print("Enter the name of your crush: ");
        String nameOfMyCrush = scan.nextLine();

        System.out.print("Enter the name of your second crush: ");
        String nameOfMyCrush2 = scan.nextLine();

        return myName + " loves " + nameOfMyCrush + " and I love "+ nameOfMyCrush2;
    }


}
