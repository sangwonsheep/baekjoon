package chap7_character;

import java.util.Scanner;

public class p1157_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int [] check = new int[26];

		String s = input.next();
		s = s.toLowerCase();

		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			check[c-'a']++;
		}

		int max = -1; 
		int ch = -2; // '?'
		for(int i = 0; i < check.length; i++) {
			if(max < check[i]) {
				max = check[i];
				ch = i;
			}
			else if(max == check[i]) {
				ch = -2;
			}
		}
		
		System.out.println((char)(ch + 'A'));

	}

}
