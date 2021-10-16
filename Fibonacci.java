package recursion;

public class Fibonacci {
	static int a = 0, b = 0, c = 1;
	public static void print(int n) {
		if (n > 0) {
			a = b;
			System.out.print(b + " ");
			b = c;
			c = a + b;
			print(n-1);
		}
		return ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);

	}

}
