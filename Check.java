package recursion;

public class Check {
	public static void print(int n){
		if (n ==0) {
			return ;
		}
		System.out.println(n);
		print(n - 1);
	
	}
	
	public static void main(String[] args) {
		int num = 3;
		print(num);
	}

}