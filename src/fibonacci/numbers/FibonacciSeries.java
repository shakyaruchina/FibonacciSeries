package fibonacci.numbers;



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
		
		// new line
		System.out.println("\n");

		for (int num = 0; num < n; num++) {
			if (num % 5 == 0) {
				System.out.println("Divisible by 5:" + num);
			}
		}

		for (int num = 0; num < n; num++) {
			if (num % 7 == 0) {
				System.out.println("Divisible by 7:" + num);
			}
		}

		for (int num = 0; num < n; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println("Divisible by 5 and 7:" + num);
			}
		}

	}

}
