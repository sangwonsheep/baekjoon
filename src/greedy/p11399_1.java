package greedy;

import java.util.Scanner;

public class p11399_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int [] array = new int[1001];

		for(int i = 0; i < n; i++) {
			array[input.nextInt()]++;
		}

		int prev = 0;
		int sum = 0;

		for(int i = 0; i < 1001; i++) {
			while(array[i]--> 0) {
				sum += (i + prev);
				prev += i;
			}
		}
		System.out.println(sum);
	}

}
