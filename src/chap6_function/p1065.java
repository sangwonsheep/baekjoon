package chap6_function;
import java.util.Scanner;

public class p1065 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(i < 100)
				count++;
			else {
				if(i == 1000)
					break;
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((one - ten) == (ten - hun)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
