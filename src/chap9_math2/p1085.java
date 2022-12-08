package chap9_math2;

import java.util.Scanner;

public class p1085 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int w = input.nextInt();
		int h = input.nextInt();
		
		int min = x;
		if((w-x) < min) {
			min = (w-x);
		}
		if((h-y) < min) {
			min = (h-y);
		}
		if(y < min) {
			min = y;
		}
		System.out.println(min);
	}

}
