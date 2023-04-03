package dp;

import java.util.Scanner;

public class p1003 {

	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		for(int tc = 0; tc < T; tc++) {
			int n = input.nextInt();
			fibonacci(n);
		}
	} 
	
	public static void fibonacci(int n) {
		int [] zero = new int[41];
		int [] one = new int[41];
		zero[0] = 1;
		one[0] = 0;
		zero[1] = 0;
		one[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			zero[i] = zero[i-1] + zero[i-2];
			one[i] = one[i-1] + one[i-2];
		}
		
		System.out.println(zero[n] + " " + one[n]);
	}
	

}
