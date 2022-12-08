package chap6_function;
import java.util.Scanner;

public class p1065_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(sequence(n));
	}
	
	public static int sequence(int num) {
		int count = 0;
		if(num < 100)
			return num;
		else {
			count = 99;
			for(int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((one - ten) == (ten - hun)) {
					count++;
				}
			}
			return count;
		}
	}

}
