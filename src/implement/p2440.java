package implement;

import java.util.Scanner;

public class p2440 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for(int i = 0; i < n; i++) {
			for(int j = n-i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
