package chap3_for_statement;
import java.util.Scanner;

public class p2739 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		
	}

}
