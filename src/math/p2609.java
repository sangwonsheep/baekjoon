package math;

import java.util.Scanner;

public class p2609 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
	}
	
	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	
	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

}
