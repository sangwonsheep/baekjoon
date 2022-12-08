package chap8_math1;

import java.util.Scanner;

public class p10757 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		String b = input.next();
		
		int maxLength = Math.max(a.length(), b.length());
		
		int [] aArray = new int[maxLength+1];
		int [] bArray = new int[maxLength+1];
		
		for(int i = a.length()-1, j = 0; i >= 0; i--, j++) {
			aArray[j] = a.charAt(i) - '0'; 
		}
		for(int i = b.length()-1, j = 0; i >= 0; i--, j++) {
			bArray[j] = b.charAt(i) - '0';
		}
		
		for(int i = 0; i < maxLength; i++) {
			int sum = aArray[i] + bArray[i];
			aArray[i] = sum % 10;
			aArray[i+1] += (sum / 10);
		}
		
		StringBuilder sb = new StringBuilder();
		if(aArray[maxLength] != 0) {
			sb.append(aArray[maxLength]);
		}
		
		for(int i = maxLength-1; i >= 0; i--) {
			sb.append(aArray[i]);
		}
		System.out.println(sb);
	}

}
