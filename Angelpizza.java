import java.util.Scanner;

public class Anglepizza{
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Spinach Pizza that costs 400.00 pesos");
        System.out.println("Enter B if you want a Four Cheese Pizza that costs 300.00 pesos");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
        double price = 0;
   

        switch (choice) {
            case 'A':
                pizza = "Creamy Spinach Pizza"; 
                price = 400.00;
                break;
            case 'B':
                pizza = "Four Cheese Pizza";
                price = 300.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }

        System.out.println("What Crust of pizza do you prefer");
        System.out.println("Choose 1 crust TOSSE(HT) OR THIN (TC)");
        String crust = scan.next();

        switch (crust){
            case "HT":
                System.out.println("Your Pizza is Tosse");
                break;
            case "TC":
                System.out.println("Your Pizza is Thin Crust");
                break;   
            default:
                System.out.println("Sorry we don''t have this kind of crust ");
                return;
        }
        System.out.println("What Size of pizza do you prefer");
        System.out.println("Choose 1 size: \nMedium 9(ME)\nFamily12(FA) \nBigFamliy 14(BF)  ");
        String size = scan.next();


        switch (size){
            case "ME":
            System.out.println("Your order Medium 9'");
            price += 0.00;
            break;
            case "FA":
            System.out.println("Your order Familiy 12'");
            price += 105.00;
            break;
            case "BF":
            System.out.println("Your order Big Family 16'");
            price += 210.00;
            break;
            default:
            System.out.println("Sorry we don't have this kind of size!");
            return;
    }   
        System.out.println("How many orders do you have?");
        double quantity = scan.nextDouble();

        System.out.println("Your order is: " + pizza);
        System.out.println("Price of your order: " + price);
        System.out.println("-------------------------------");
        System.out.println("Your total amount of your order is:" + (quantity * price) );

        scan.close();
    }
}   
