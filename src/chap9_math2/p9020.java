package chap9_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9020 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			boolean [] check = new boolean[n + 1];
			get_prime(check);
			
			int p = n / 2;
			int q = n / 2;
			
			while(true) {
				if(check[p] == false && check[q] == false) {
					System.out.println(p + " " + q);
					break;
				}
				p--;
				q++;
			}
		}
		
		
	}
	
	public static void get_prime(boolean [] array) {
		
		array[0] = array[1] = true;
		
		for(int i = 2; i <= Math.sqrt(array.length); i++) {
			if(array[i])
				continue;
			else {
				for(int j = i * i; j < array.length; j += i) {
					array[j] = true;
				}
			}
		}
	}

}
