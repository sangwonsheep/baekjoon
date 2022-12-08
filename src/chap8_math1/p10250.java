package chap8_math1;

import java.util.Scanner;

public class p10250 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		int [][] room;

		for(int i = 0; i < t; i++) {
			int h = input.nextInt();
			int w = input.nextInt();
			int n = input.nextInt();
			room = new int[w][h];
			int [] array = new int[room.length * room[0].length];
			for(int j = 0; j < room.length; j++) {
				for(int k = 0; k < room[j].length; k++) {
					room[j][k] = (k+1) * 100 + (j+1);   
					array[room[j].length * j + k] = room[j][k];
				}
			}
			System.out.println(array[n-1]);
		}

	}

}
