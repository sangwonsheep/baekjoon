package chap7_character;

import java.util.Scanner;

public class p1157 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int [] check = new int[26];

		String s = input.next();
		s = s.toLowerCase();

		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			check[c-'a']++;
		}

		int max = check[0];
		int maxIndex = 0;
		for(int i = 1; i < check.length; i++) {
			if(max < check[i]) {
				max = check[i];
				maxIndex = i;
			}
		}
		for(int i = 0; i < check.length; i++) {
			if(max == check[i]) {
				if(i == maxIndex)
					continue;
				maxIndex = -1;
			}
		}
		
		if(maxIndex == -1) {
			System.out.println("?");
		}
		else { 
			System.out.println((char)(maxIndex + 'A'));
		}

//		for(int i : check) {
//			System.out.print(i + " ");
//		}
	}

}
