package chap3_for_statement;
import java.util.Scanner;

public class p2438 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
