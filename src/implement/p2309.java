package implement;

import java.util.Arrays;
import java.util.Scanner;

public class p2309 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int [] array = new int[9];
		
		int sum = 0;
		int hundred = 100;
		for(int i = 0; i < 9; i++) {
			array[i] = input.nextInt();
			sum += array[i];
		}
		
		Arrays.sort(array);
		
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(sum - array[i] - array[j] == 100) {
					a = array[i];
					b = array[j];
					break;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] == a || array[i] == b)
				continue;
			System.out.println(array[i]);
		}
	}

}
