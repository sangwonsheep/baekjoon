package chap5_array;
import java.util.Scanner;

public class p3052 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean [] a = new boolean[42];

		for(int i = 0; i < 10; i++) {
			a[Integer.parseInt(input.nextLine()) % 42] = true;
		}
		
		int count = 0;
		for(boolean check : a) {
			if(check)
				count++;
		}
		System.out.println(count);
	}

}
