package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class p11399 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		
		int prev = 0;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			prev += array[i];
			sum += prev; 
		}
		
		System.out.println(sum);
	}

}
