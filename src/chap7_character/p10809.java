package chap7_character;

import java.util.Scanner;

public class p10809 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int [] array = new int[26];
		
		String s = input.next();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = -1;
		}
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(array[c-'a'] == -1)
				array[c-'a'] = i;
		}
		
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

}
