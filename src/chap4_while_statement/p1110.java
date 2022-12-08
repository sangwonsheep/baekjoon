package chap4_while_statement;
import java.util.Scanner;

public class p1110 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String n = input.next();
		if(n.length() == 1)
			n = "0" + n;
		int a, b;
		int count = 0;
		a = Character.getNumericValue(n.charAt(0));
		b = Character.getNumericValue(n.charAt(1));
		String str = "";
		str = "" + n.charAt(1) + ((a+b) % 10);
		count++;
		
		while(!n.equals(str)) {
			a = Character.getNumericValue(str.charAt(0));
			b = Character.getNumericValue(str.charAt(1));
			str = "" + str.charAt(1) + ((a+b) % 10);
			count++;
		}
		System.out.println(count);
	}

}
