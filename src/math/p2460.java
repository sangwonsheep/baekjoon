package math;

import java.util.Scanner;

public class p2460 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int max = 0;
		
		for(int i = 0; i < 10; i++) {
			int off = input.nextInt(); // get off
			int on = input.nextInt(); // get on
			
			sum -= off;
			sum += on;
			if(sum > max)
				max = sum;
		}
		System.out.println(max);
	}

}
