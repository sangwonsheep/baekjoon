package chap9_math2;

import java.util.Scanner;

public class p11653 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		while(true) {
			if(n <= 1)
				break;
			
			for(int i = 2; i <= n; i++) {
				if(n % i == 0) {
					System.out.println(i);
					n /= i;
					break;
				}
			}
		}
	}

}
