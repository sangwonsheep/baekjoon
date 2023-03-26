package implement;

import java.util.Arrays;
import java.util.Scanner;

public class p10817 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		int [] array = new int[3];
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		Arrays.sort(array);
		System.out.println(array[1]);
	}

}
