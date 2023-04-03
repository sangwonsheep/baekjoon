package dp;

import java.util.Scanner;

public class p1149 {
	
	static int RED = 0;
	static int GREEN = 1;
	static int BLUE = 2;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int [][] array = new int[1001][3];
		int [][] dp = new int[1001][3];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				array[i][j] = input.nextInt();
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				dp[i][j] = array[i][j];
			}
		}

		for(int i = 1; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				if(j == RED) {
					dp[i][j] = array[i][j] + Math.min(dp[i-1][GREEN], dp[i-1][BLUE]);
				}
				else if(j == GREEN) {
					dp[i][j] = array[i][j] + Math.min(dp[i-1][RED], dp[i-1][BLUE]);
				}
				else if(j == BLUE) {
					dp[i][j] = array[i][j] + Math.min(dp[i-1][RED], dp[i-1][GREEN]);
				}
			}
		}
		
		System.out.println(Math.min(dp[n-1][RED], Math.min(dp[n-1][GREEN], dp[n-1][BLUE])));
	}

}
