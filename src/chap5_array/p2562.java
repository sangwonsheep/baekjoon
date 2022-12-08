package chap5_array;
import java.util.Scanner;

public class p2562 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] array = new int[9];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		
		int max = 0;
		int maxIndex = 0;
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				maxIndex = (i+1);
			}
		}
		System.out.println(max);
		System.out.println(maxIndex);
	}

}
