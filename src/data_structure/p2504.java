package data_structure;

import java.util.Scanner;
import java.util.Stack;

public class p2504 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		
		Stack<Character> stack = new Stack<>();
		
		int value = 1;
		int result = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				stack.push(s.charAt(i));
				value *= 2;
			}
			else if(s.charAt(i) == '[') {
				stack.push(s.charAt(i));
				value *= 3;
			}
			else if(s.charAt(i) == ')') {
				if(stack.isEmpty() || stack.peek() != '(') {
					result = 0;
					break;
				}
				if(s.charAt(i-1) == '(') {
					result += value;
				}
				stack.pop();
				value /= 2;	
			}
			else if(s.charAt(i) == ']') {
				if(stack.isEmpty() || stack.peek() != '[') {
					result = 0;
					break;
				}
				if(s.charAt(i-1) == '[') {
					result += value;
				}
				stack.pop();
				value /= 3;
			}
		}
		if(!stack.isEmpty()) // stack에 괄호 남았을 경우 처리
			result = 0;
		System.out.println(result);
		
	}

}
