package greedy;

import java.util.Scanner;

public class p13305 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		long [] a = new long[n-1]; // road
		long [] b = new long[n]; // oil

		for(int i = 0; i < n-1; i++) {
			a[i] = input.nextLong();
		}
		for(int i = 0; i < n; i++) {
			b[i] = input.nextLong();
		}

		long min = b[0];
		long sum = 0;

		for(int i = 0; i < n-1; i++) {
			if(min > b[i]) {
				min = b[i];
			}

//			if(b[i] > b[i+1]) {
//				if(min <= b[i]) {
//					sum += min * a[i];
//				}
//				else {
//					sum += b[i] * a[i];
//				}
//			}
//			else {
//				if(min <= b[i]) {
//					sum += min * a[i];
//				}
//				else {
//					sum += b[i] * (a[i] + a[i+1]);
//				}
//			}
			
			sum += min * a[i];
		}

		System.out.println(sum);
	}

}
