package recursion;
import java.util.Scanner;

public class All_Index {
	static int copy[] = new int[1];
	static int index = 0;
	public static int[] add(int value){
		if (value == 0) {
			return copy;
		}
		if (copy.length == index) {
			restructure(value);
			return copy;
		}
		copy[index] = value;
		index++;
		return copy;
	}
	
	public static void restructure(int value) {
		int tem[] = copy;
	    copy = new int[tem.length + 1];
	    for (int i = 0; i < tem.length; i++) {
		     copy[i] = tem[i];
	         }
	    copy[tem.length] = value;
	    index++;	
	}
	
	public static int[] index(int arr[], int x,int start) {
		if (start >= arr.length - 1) {
			if (arr[start] == x){
				return add(start + 1);
			}
			else
				return add(0);
		}
		if (arr[start] == x) {
			int temp[] = add(start + 1);
		}
		
		return index(arr, x, start + 1);
		
	}
	public static int[] index(int arr[], int x) {
		return index(arr, x, 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, x;
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		x = sc.nextInt();
		int check[] = index(arr, x);
		for(int i = 0; i < check.length; i++) {
			System.out.print(check[i] + " ");
		}

	}

}
