package chap2_if_statement;
import java.util.Scanner;

public class p2525 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		b += c;

		while(b > 59) {
			a++;
			b -= 60;
			if(a > 23)
				a = 0;

		}
		System.out.println(a + " " + b);
	}

}
