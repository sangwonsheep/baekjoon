package chap5_array;
import java.util.Scanner;

public class p1546 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		double [] grade = new double[n];
		
		double m = 0;
		double sum = 0;
		for(int i = 0; i < grade.length; i++) {
			grade[i] = input.nextDouble();
			if(grade[i] > m)
				m = grade[i];
		}
		for(int i = 0; i < grade.length; i++) {
			grade[i] = (grade[i] / m) * 100;
			sum += grade[i];
		}
		System.out.println(sum/n);
	}

}
