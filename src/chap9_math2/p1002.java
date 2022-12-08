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
		// 두 점 사이의 거리
		int distance = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		// 두 원의 크기가 같은 경우
		if(x1 == x2 && y1 == y2 && r1 == r2)
			return -1;
		
		// 두 점 사이의 거리보다 반지름의 합보다 더 큰 경우
		else if(distance > Math.pow(r1+r2, 2))
			return 0;
		
		// 두 점 사이의 거리보다 반지름의 합보다 더 작은 경우
		else if(distance < Math.pow(r1-r2, 2))
			return 0;
		
		// 내접한 경우
		else if(distance == Math.pow(r1-r2, 2))
			return 1;
		
		// 외접한 경우
		else if(distance == Math.pow(r1+r2, 2)) 
			return 1;
		
		// 두 원의 접점이 2개인 경우
		else
			return 2;
	}

}
