package chap9_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1929 {

	public static boolean[] prime;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer s = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(s.nextToken());
		int n = Integer.parseInt(s.nextToken());
		
		prime = new boolean[n + 1];
		get_prime();
				
		for(int i = m; i <= n; i++) {
			// false = 소수 
			if(!prime[i]) System.out.println(i);
		}
	}
	
	// 에라토스테네스의 체
	// " k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다"
	public static void get_prime() {
		// true = 소수아님 , false = 소수 
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				// System.out.print(j + " ");
				prime[j] = true;
			}
		}
	}

}
