package chap8_math1;

import java.util.Scanner;

public class p2292 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int a = 0;
		int count = 0;
		for(int i = 0; a < n; i++) {
			if(i == 0)
				a = 1;
			else {
				a += (i * 6);
			}
			count++;
		}
		System.out.println(count);
		
	}

}
