package chap9_math2;

import java.util.Scanner;

public class p1978 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [] array = new int[n];
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			array[i] = input.nextInt();
			if(prime(array[i]))
				count++;
		}
		System.out.println(count);
	}
	
	public static boolean prime(int num) {
		if(num < 2) {
			return false;
		}
		else if (num == 2) {
			return true;
		}
		else {
			for(int i = 2; i < num; i++) {
				if(num % i == 0)
					return false;
			}
			return true;
		}
	}
	
}
