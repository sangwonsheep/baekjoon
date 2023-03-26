package math;

import java.util.ArrayList;
import java.util.Scanner;

public class p2501 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		
		ArrayList<Integer> divisor = new ArrayList<>(n);
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0)
				divisor.add(i);
		}
		try {
			System.out.print(divisor.get(k-1));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("0");
		}
		
	}

}
