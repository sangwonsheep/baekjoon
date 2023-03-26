package math;

import java.util.Scanner;

public class p3460 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		for(int i = 0; i < T; i++) {
			int n = input.nextInt();
			int [] array = toBinary(n);
			for(int j = 0; j < array.length; j++) {
				if(array[j] == 1)
					System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
	
	public static int[] toBinary(int num) {
		int [] array = new int[num];
		
		int i = 0;
		while(num > 0) {
			array[i] = num % 2;
			num /= 2;
			i++;
		}
		return array;
	}

}
