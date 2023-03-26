package greedy;

import java.util.Scanner;

public class p1789 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		long s = input.nextLong();
		long sum = 0;
		long i = 1;
		long n = 0;
		
		while(true) {
			sum += i;
			if(sum > s) {
				n = i;
				break;
			}
			i++;
		}
		System.out.println(n-1);
	}

}
