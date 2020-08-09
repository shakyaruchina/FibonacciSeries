package fibonacci.numbers;

import java.util.Scanner;

public class UserInputFibonacciNumber {

	public static void main(String[] args) {
		int a = 0, b = 0, c=1;
		
		//scanner for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of nth number to print fibonacci series :");
		
		//integer input
		int n = scan.nextInt();
		//printing the series
		System.out.print("Fibonacci Series : ");
		//for loop to print the expected fibonacci series
		for(int i=0; i<=n; i++) {
			a=b;
			b=c;
			c= a+b;
			
			System.out.print(a+",");
		}
		
		

	}

}
