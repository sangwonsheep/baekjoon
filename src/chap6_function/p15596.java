package chap6_function;

public class p15596 {
	public static void main(String[] args) {
		
		int [] array = {1, 2, 3};
		
		System.out.println(sum(array));
	}
	
	public static long sum(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
