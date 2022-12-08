package chap7_character;

import java.util.Scanner;

public class p2908 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		String b = input.next();
		
		a = new StringBuffer(a).reverse().toString();
		b = new StringBuffer(b).reverse().toString();

		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		if(num1 > num2)
			System.out.println(num1);
		else
			System.out.println(num2);
	}

}
