package chap10_recursion;

import java.util.Scanner;

public class p2447 {

	static char[][] array;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		array = new char[n][n];
		
		star(0, 0, n, false);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(array[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
	
	public static void star(int x, int y, int n, boolean check) {
		if(check) {
			for(int i = x; i < x+n; i++) {
				for(int j = y; j < y+n; j++) {
					array[i][j] = ' ';
				}
			}
			return;
		}
		
		if(n == 1) {
			array[x][y] = '*';
			return;
		}
		
		// 재귀 조건
		int size = n / 3; // n = 27, size = 9
		int count = 0;
		for(int i = x; i < x+n; i += size) {
			for(int j = y; j < y+n; j += size) {
				count++;
				if(count == 5) { // 공백인 경우
					star(i, j, size, true);
				}
				else {
					star(i, j, size, false);
				}
			}
		}
	}

}
