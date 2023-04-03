package implement;

import java.util.Scanner;

public class p14719 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int w = input.nextInt();
		
		int [] block = new int[w];
		
		for(int i = 0; i < w; i++) {
			block[i] = input.nextInt();
		}
		
		int current = 0;
		int result = 0;
		int leftMax;
		int rightMax;
		
		for(int i = 1; i < w-1; i++) {
			current = block[i];
			leftMax = 0;
			rightMax = 0;
			for(int j = i-1; j >= 0; j--) {
				if(block[j] > current)
					leftMax = Math.max(leftMax, block[j]);
			}
			for(int j = i+1; j < w; j++) {
				if(block[j] > current)
					rightMax = Math.max(rightMax, block[j]);
			}
			
			int check = Math.min(rightMax, leftMax);
			if(check > current)
				result += (check - current);
		}
		System.out.println(result);
	}

}
