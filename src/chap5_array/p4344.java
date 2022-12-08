package chap5_array;
import java.util.Scanner;

public class p4344 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int c = input.nextInt();
		int [] array;
		
		double sum = 0;
		for(int i = 0; i < c; i++) {
			int n = input.nextInt();
			array = new int[n];
			for(int j = 0; j < n; j++) {
				array[j] = input.nextInt();
				sum += array[j];
			}
			
			double average = sum / n;
			int count = 0;
			
			for(int j = 0; j < n; j++) {
				if(array[j] > average)
					count++;
			}
			System.out.printf("%.3f%%\n", ((double)count/n) * 100);
			sum = 0;
		}
		input.close();
	}

}
