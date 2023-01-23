
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Input a scanner method 
		System.out.print("Input M: ");		// ask the user 
        int inputM = sc.nextInt();
        System.out.print("Input N: ");		
        int inputN = sc.nextInt();
          
		System.out.print("fibonaci series of " + 15 + " numbers ");
		
		for(int i = 1; i<=15; i++) { // create
			System.out.print(fibonacciRecursion(inputM,inputN)+ " "); 
		}
	}
	public static int fibonacciRecursion(int m, int n) { // call a method 
//		if(n==0) {
//			return 0;
//		}
		
//		if(n==1|| n==2) {
//			return 1;
//		}
		System.out.println(m);
		n = m+m;
		
		return fibonacciRecursion(n-1)+ fibonacciRecursion(n-2);
	}
}

