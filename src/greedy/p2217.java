package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class p2217 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		
		Arrays.sort(array);
		
		int max = array[n-1];
		
		for(int i = 0; i < n; i++) {
			   if(max < array[i] * (n - i))
				   max = array[i] * (n - i);
		}
		System.out.println(max);
	}

}
