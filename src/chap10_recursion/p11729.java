package chap10_recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11729 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// n���� ������ 1�� ���ҿ��� 3�� �������� �ű��. 2�� ������ ���� �������� ����Ѵ�.
		bw.write((int)(Math.pow(2, n) - 1) + "\n");
		move(n, 1, 3, 2);
		
		bw.flush();
		bw.close();
	}
	
	/**
	 * �ϳ���ž ��� �˰���.
	 * n���� ������ i�� ���ҿ��� j�� �������� �ű�� ������ �μ��Ѵ�.
	 * @param n ���� ����.
	 * @param i ����� ���� ��ȣ.
	 * @param j ������ ���� ��ȣ.
	 * @param k ���� ���� ��ȣ.
	 */
	
	public static void move(int n, int i, int j, int k) throws IOException {
		// ���� ���� : n == 0
		if(n > 0) { 
			move(n-1, i, k, j);
			bw.write(i + " " + j + "\n");
			move(n-1, k, j, i);
		}
	}

}
