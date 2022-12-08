package chap9_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4948 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		while(true) {
			int count = 0;
			n = Integer.parseInt(br.readLine());
			if(n == 0)
				break;
			
			boolean [] check = new boolean[2 * n + 1];
			get_prime(check);
			
			for(int i = n + 1; i <= 2*n; i++) {
				if(!check[i])
					count++;
			}
			System.out.println(count);
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
