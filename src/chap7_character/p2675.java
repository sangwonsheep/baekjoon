package chap7_character;

import java.util.Scanner;

public class p2675 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		String p = new String();
		for(int i = 0; i < t; i++) {
			int r = input.nextInt();
			String s = input.next();
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < r; k++)
					p += s.charAt(j);
			}
			System.out.println(p);
			p = "";
		}
	}

}
