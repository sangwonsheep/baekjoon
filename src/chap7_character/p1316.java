package chap7_character;

import java.util.Scanner;

public class p1316 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int count = 0;
		
		boolean [] cArray;
		boolean check;
		
		int prev;

		for(int i = 0; i < n; i++) {
			check = true;
			cArray = new boolean[26];
			prev = 0;
			String s = input.next();
			for(int j = 0; j < s.length(); j++) {
				int now = s.charAt(j);
				if(prev != now) {
					if(cArray[now - 'a'] == false) {
						cArray[now - 'a'] = true;
						prev = now;
					}
					else {
						 check = false;
						 break;
					}
				}
				else {
					check = true;
				}
			}
			if(check)
				count++;
			
		}
		System.out.println(count);

	}

}
