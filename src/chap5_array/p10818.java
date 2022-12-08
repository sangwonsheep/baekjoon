package chap5_array;
import java.util.Scanner;

public class p10818 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int [] array = new int[n];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		int min = array[0];
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(min > array[i])
				min = array[i];
			if(max < array[i])
				max = array[i];
		}
		System.out.println(min + " " + max);
	}

}
