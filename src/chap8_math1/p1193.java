package chap8_math1;

import java.util.Scanner;

public class p1193 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		int cross = 0; // �밢�� ���� 
		int sum = 0; // ��ü ����
		
		while(true) {
			cross++;
			sum += cross;
			if(x <= sum) {
				if(cross % 2 == 0) {
					System.out.println(x + cross - sum + "/" + ((cross+1) - (x + cross - sum)));
				}
				else {
					System.out.println((sum - x + 1) + "/" + (x + cross - sum));
				}
				break;
			}
		}
		
	}

}
