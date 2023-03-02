package greedy;

import java.util.Scanner;

public class p5585 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = 1000 - input.nextInt();

		int count = 0;
		
		while(true) {
			if(n <= 0)
				break;
			
			if(n >= 500) {
				count += (n / 500);
				n %= 500;
			}
			else if(n >= 100) {
				count += (n / 100);
				n %= 100;
			}
			else if(n >= 50) {
				count += (n / 50);
				n %= 50;
			}
			else if(n >= 10) {
				count += (n / 10);
				n %= 10;
			}
			else if(n >= 5) {
				count += (n / 5);
				n %= 5;
			}
			else {
				count += n;
				n = 0;
			}
		}
		
		System.out.println(count);
	}

}
