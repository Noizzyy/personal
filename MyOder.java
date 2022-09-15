// import the Scanner class
import java.util.Scanner;

public class Myoder{

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call

        String MyOrder = MyOdermeal();
        System.out.println(MyOrder);

        double myOrder = add();
        System.out.println("Total bill of your Meal" + myOrder);
       

        scan.close();
    }

    static String MyOdermeal() {
        System.out.println("Your order meal");
      

        System.out.print("Enter your 1st order");
        String Order1 = scan.nextLine();

        System.out.print("Enter your 2nd order");
        String Order2 = scan.nextLine();

        System.out.print("Enter your 3rd order");
        String Order3 = scan.nextLine();

        return "Your order is " + Order1 + Order2 + Order3;
    }

    static int add() {
            System.out.println("Please enter the price of your Meal");
            System.out.print("Enter first meal: ");
            int x = scan.nextInt();
    
            System.out.print("Enter second meal: ");
            int y = scan.nextInt();

            System.out.print("Enter third meal: ");
            int z = scan.nextInt();

            return x + y + z;
    }   
   

}
