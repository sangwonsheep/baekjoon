package chap5_array;
import java.util.Scanner;

public class p2577 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		int [] numCheck = new int[10];
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		int total = a * b * c;
		
		String s = Integer.toString(total);
		System.out.println(s);
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < 10; j++) {
				if(s.charAt(i) == '0' + j) {
					numCheck[j]++;
				}
			}
		}
		for(int i : numCheck)
			System.out.println(i);
	}

}
