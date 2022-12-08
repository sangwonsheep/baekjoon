package chap8_math1;

import java.util.Scanner;

public class p2775 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		int [][] array;
		
		for(int i = 0; i < t; i++) {
			int k = input.nextInt();
			int n = input.nextInt();
			if(k < 1 || n > 14)
				break;
			array = new int[k+1][n];
			for(int a = 0; a < array.length; a++) {
				for(int b = 0; b < array[a].length; b++) {
					if(a == 0)
						array[a][b] = (b+1);
					else {
						for(int c = 0; c <= b; c++) {
							array[a][b] += array[a-1][c];
						}
					}
				}
			}
			System.out.println(array[k][n-1]);
		}
	}

}
