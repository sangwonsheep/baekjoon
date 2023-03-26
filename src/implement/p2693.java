package implement;

import java.util.Arrays;
import java.util.Scanner;

public class p2693 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int [] A = new int[10];
		int N = 3;
		
		int T = input.nextInt();
		
		for(int i = 0; i < T; i++) {
			for(int j = 0; j < A.length; j++) {
				A[j] = input.nextInt();
			}
			Arrays.sort(A);
			System.out.println(A[A.length - N]);
		}
	}

}

