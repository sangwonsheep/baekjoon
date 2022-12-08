package chap11_bruteforce;

import java.util.Scanner;

public class p7568 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [][] array = new int[n][2];
		
		for(int i = 0; i < array.length; i++) {
			array[i][0] = input.nextInt();
			array[i][1] = input.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			int count = 1;
			for(int j = 0; j < n; j++) {
				if(i == j)
					continue;
				
				if(array[i][0] < array[j][0] && array[i][1] < array[j][1])
					count++;
			}
			System.out.print(count + " ");
		}
	}

}
