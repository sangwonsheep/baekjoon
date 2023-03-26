package implement;

import java.util.Scanner;

public class p2920 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int [] array = new int[8];
		
		for(int i = 0; i < 8; i++) {
			array[i] = input.nextInt();
		}
		
		String s = "";
		
		for(int i = 0; i < 7; i++) {
			if(array[i+1] == array[i] + 1)
				s = "ascending";
			else if(array[i+1] == array[i] - 1)
				s = "descending";
			else {
				s = "mixed";
				break;
			}
		}
		System.out.println(s);
	}

}
