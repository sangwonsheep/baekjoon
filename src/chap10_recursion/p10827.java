package chap10_recursion;

import java.util.Scanner;

public class p10827 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(factorial(n));
		
	}
	
	public static int factorial(int n) {
		if(n == 0 || n == 1)
			return 1;
		else {
			return n * factorial(n-1);
		}
	}

}
