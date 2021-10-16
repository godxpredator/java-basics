package recursion;
import java.util.Scanner;
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
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:-\n");
		int x=sc.nextInt();
		print(x);

	}

}
