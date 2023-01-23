
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Input a scanner method 
		System.out.print("Input M: ");		// ask the user 
        String inputM = sc.nextLine();
        System.out.print("Input N: ");		
        String inputn = sc.nextLine();
          
		System.out.print("fibonaci series of " + 15 + " numbers ");
		
		for(int i = 0; i<=15; i++) { // create
			System.out.print(fibonacciRecursion(i)+ " "); 
		}
	}
	public static int fibonacciRecursion(int n) { // call a method 
		if(n==0) {
			return 0;
		}
		if(n==1|| n==2) {
			return 1;
		}
		return fibonacciRecursion(n-1)+ fibonacciRecursion(n-2);
	}
}
