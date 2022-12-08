package chap5_array;
import java.util.HashSet;
import java.util.Scanner;

public class p3052_hash {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			set.add(input.nextInt() % 42);
		}
		System.out.println(set.size());
	}

}
