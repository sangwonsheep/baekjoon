package chap3_for_statement;
import java.util.Scanner;

public class p10950 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for(int i = 0; i < t; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			System.out.println(a+b);
		}
	}

}
