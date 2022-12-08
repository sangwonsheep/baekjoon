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
			// false = �Ҽ� 
			if(!prime[i]) System.out.println(i);
		}
	}
	
	// �����佺�׳׽��� ü
	// " k=2 ���� ��N ���ϱ��� �ݺ��Ͽ� �ڿ����� �� k�� ������ k�� ������� ���ܽ�Ų��"
	public static void get_prime() {
		// true = �Ҽ��ƴ� , false = �Ҽ� 
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
