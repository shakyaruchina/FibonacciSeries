package fibonacci.numbers;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 40, a=0, b=0, c=1;
		
		//Scanner scan = new Scanner(System.in);
		System.out.println("First 40 Fibonacci Series :");
		
		//to find the fibonacci numbers
		for(int i =0; i<=n; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"");
		}
		// new line
		System.out.println("\n");
		//numbers divisible by 5	
		for (int num = 0; num < n; num++) {
			if (num % 5 == 0) {
				System.out.println("Divisible by 5:" + num);
			}
		}
		//numbers divisible by 7	
		for (int num = 0; num < n; num++) {
			if (num % 7 == 0) {
				System.out.println("Divisible by 7:" + num);
			}
		}
		//numbers divisible by both 5 and 7
		for (int num = 0; num < n; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println("Divisible by 5 and 7:" + num);
			}
		}
		
		

	}

}
