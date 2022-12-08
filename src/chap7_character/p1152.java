package chap7_character;

import java.util.Scanner;

public class p1152 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		s = s.trim();
		
		if(s.equals("")) {
			s = null;
			System.out.println("0");
		}
		else {
			String [] str = s.split(" ");
			System.out.println(str.length);
		}
		
	}

}
