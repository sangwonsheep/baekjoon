package chap5_array;
import java.util.Scanner;

public class p8958 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		String [] str = new String[n];
		int [] oSum = new int[n];

		for(int i = 0; i < str.length; i++) {
			str[i] = input.next();
		}

		int count;
		int sum;
		for(int i = 0; i < str.length; i++) {
			sum = 0;
			count = 0;
			for(int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j) == 'O') {
					count++;;
				}
				else {
					count = 0;
				}
				sum += count;
			}
			oSum[i] = sum;
		}
		for(int i : oSum)
			System.out.println(i);
	}

}
