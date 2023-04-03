package dp;

import java.util.Scanner;

public class p9095 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		for(int tc = 0; tc < T; tc++) {
			int n = input.nextInt();
			int [] dp = new int[11];
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			
			for(int i = 4; i <= n; i++) {
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			}
			System.out.println(dp[n]);
		}
	}

}
