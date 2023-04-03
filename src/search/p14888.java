package search;

import java.util.Scanner;

public class p14888 {

	public static int N;
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
	public static int [] A;
	public static int [] operator = new int[4];
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		N = input.nextInt();
		A = new int[N];
	
		for(int i = 0; i < N; i++) {
			A[i] = input.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			operator[i] = input.nextInt();
		}

		dfs(A[0], 1);
		System.out.println(max);
		System.out.println(min);
	}
	
	// int idx == depth
	public static void dfs(int num, int idx) {
		if(idx == N) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			if(operator[i] > 0) {
				operator[i]--;
				
				switch(i) {
				case 0 : dfs(num + A[idx], idx + 1); break;
				case 1 : dfs(num - A[idx], idx + 1); break;
				case 2 : dfs(num * A[idx], idx + 1); break;
				case 3 : dfs(num / A[idx], idx + 1); break;
				}
				operator[i]++;
			}
		}
	}

}
