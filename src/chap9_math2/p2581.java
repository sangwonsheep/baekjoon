package chap9_math2;

import java.util.Scanner;

public class p2581 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int m = input.nextInt();
		int n = input.nextInt();

		int sum = prime_sum(m, n);
		System.out.println(sum);
		if(sum != -1)
			System.out.println(prime_min(m, n));
	}

	public static int prime_sum(int min, int max) {
		int sum = 0;
		if(max < 2) {
			return -1;
		}
		else if (max == 2) {
			return 2;
		}
		else {
			if(min <= 2 && max > 2) {
				sum += 2;
			}
			for(int i = min; i <= max; i++) {
				boolean check = false;
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						check = false;
						break;
					}
					else {
						check = true;
					}
				}
				if(check)
					sum += i;
			}
			if(sum == 0)
				return -1;
			else
				return sum;
		}
	}
	
	public static int prime_min(int min, int max) {
		if(max < 2) {
			return -1;
		}
		else if (max == 2) {
			return 2;
		}
		else {
			if(min <= 2 && max > 2) {
				return 2;
			}
			for(int i = min; i <= max; i++) {
				boolean check = false;
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						check = false;
						break;
					}
					else {
						check = true;
						
					}
				}
				if(check)
					return i;
			}
			return -1;
		}
	}

}
