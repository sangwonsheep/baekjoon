package implement;

import java.util.Scanner;

public class p2441 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++)
				System.out.print(" ");
			for(int j = n-i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
