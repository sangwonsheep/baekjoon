package chap7_character;

import java.util.Scanner;

public class p2941 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String s = input.next();

		int count = 0;

		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if(c == 'l') {
				if((i+1) < s.length()) {
					if(s.charAt(i+1) == 'j')
						i++;
				}
			}
			else if(c == 'c') {
				if((i+1) < s.length()) {
					if(s.charAt(i+1) == '-' || s.charAt(i+1) == '=')
						i++;
				}
			}
			else if(c == 'd') {
				if((i+1) < s.length()) {
					if(s.charAt(i+1) == '-')
						i++;
					else if(s.charAt(i+1) == 'z' && (i+2) < s.length()) {
						if(s.charAt(i+2) == '=')
							i += 2;
					}
				}

			}
			else if(c == 'n') {
				if((i+1) < s.length()) {
					if(s.charAt(i+1) == 'j')
						i++;
				}
			}
			else if(c == 's') {
				if((i+1) < s.length()) {
					if(s.charAt(i+1) == '=')
						i++;
				}
			}
			else if(c == 'z') {
				if((i+1) < s.length()) {
					if(s.charAt(i+1) == '=')
						i++;
				}
			}

			count++;
		}
		System.out.println(count);
	}

}
