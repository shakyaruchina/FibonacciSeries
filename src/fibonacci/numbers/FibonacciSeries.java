package fibonacci.numbers;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 40, a=0, b=0, c=1;
		
		//Scanner scan = new Scanner(System.in);
		System.out.println("First 40 Fibonacci Series :");
		
		for(int i =0; i<=n; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"");
		}
		

	}

}
