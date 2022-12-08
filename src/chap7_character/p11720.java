package chap7_character;

import java.util.Scanner;

public class p11720 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		String s = input.next();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += Character.getNumericValue(s.charAt(i));
		}
		System.out.println(sum);
	}
}
