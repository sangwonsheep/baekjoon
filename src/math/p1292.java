package math;

import java.util.Scanner;

public class p1292 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		
		int [] array = new int[1000];
		int n = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j <= i; j++) {
				if(n >= 1000)
					break;
				array[n] = (i+1);
				n++;
			}
			
		}
		int sum = 0;
		for(int i = A-1; i <= B-1; i++) {
			sum += array[i];
		}
		System.out.println(sum);
	}

}
