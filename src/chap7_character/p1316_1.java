package chap7_character;

import java.util.Scanner;

public class p1316_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean [] alphaCheck;

		int n = input.nextInt();

		boolean check;
		
		int count = 0;

		for(int i = 0; i < n; i++) {
			String s = input.next();
			check = true;
			alphaCheck = new boolean[26];
			for(int j = 0; j < s.length(); j++) {
				char prev = s.charAt(j);
				alphaCheck[s.charAt(0) - 'a'] = true;
				if((j+1) < s.length()) {
					char curr = s.charAt(j+1);
					if(prev != curr) {
						if(alphaCheck[curr - 'a'] == false) {
							alphaCheck[curr - 'a'] = true;
						}
						else { 
							check = false;
							break;
						}
					}
					else {
						continue;
					}
				}
			}
			if(check)
				count++;
		}
		
		System.out.println(count);
	}

}
