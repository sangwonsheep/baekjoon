package chap8_math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2775_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		int [][] array;

		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
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
