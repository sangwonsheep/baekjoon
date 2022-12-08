package chap9_math2;

import java.util.Scanner;

public class p4153 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while(true) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			if(a == 0 && b == 0 && c == 0)
				break;

			int x,y,z;
			
			if(a > b && a > c && b > c) { // a b c
				z = a; y = b; x = c; 
			}
			else if(a > b && a > c && c > b) { // a c b
				z = a; y = c; x = b;
			}
			else if(b > a && b > c && a > c) { // b a c
				z = b; y = a; x = c;
			}
			else if(b > a && b > c && c > a) { // b c a
				z = b; y = c; x = a;
			}
			else if(c > a && c > b && a > b) { // c a b
				z = c; y = a; x = b;
			}
			else { // c b a
				z = c; y = b; x = a;
			}
		
			if((z * z) == (x * x) + (y * y))
				System.out.println("right");
			else
				System.out.println("wrong");
		}

	}


}
