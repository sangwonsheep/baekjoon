package chap9_math2;

import java.util.Scanner;

public class p1002 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while(t--> 0) {
			int x1 = input.nextInt(); int y1 = input.nextInt(); int r1 = input.nextInt();
			int x2 = input.nextInt(); int y2 = input.nextInt(); int r2 = input.nextInt();
			
			System.out.println(point_num(x1, y1, r1, x2, y2, r2));
		}
	}
	
	public static int point_num(int x1, int y1, int r1, int x2, int y2, int r2) {
		// �� �� ������ �Ÿ�
		int distance = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		// �� ���� ũ�Ⱑ ���� ���
		if(x1 == x2 && y1 == y2 && r1 == r2)
			return -1;
		
		// �� �� ������ �Ÿ����� �������� �պ��� �� ū ���
		else if(distance > Math.pow(r1+r2, 2))
			return 0;
		
		// �� �� ������ �Ÿ����� �������� �պ��� �� ���� ���
		else if(distance < Math.pow(r1-r2, 2))
			return 0;
		
		// ������ ���
		else if(distance == Math.pow(r1-r2, 2))
			return 1;
		
		// ������ ���
		else if(distance == Math.pow(r1+r2, 2)) 
			return 1;
		
		// �� ���� ������ 2���� ���
		else
			return 2;
	}

}
