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
		
		// n개의 원반을 1번 말뚝에서 3번 말뚝으로 옮긴다. 2번 말뚝은 보조 말뚝으로 사용한다.
		bw.write((int)(Math.pow(2, n) - 1) + "\n");
		move(n, 1, 3, 2);
		
		bw.flush();
		bw.close();
	}
	
	/**
	 * 하노이탑 재귀 알고리즘.
	 * n개의 원반을 i번 말뚝에서 j번 말뚝으로 옮기는 절차를 인쇄한다.
	 * @param n 원반 갯수.
	 * @param i 출발점 말뚝 번호.
	 * @param j 도착점 말뚝 번호.
	 * @param k 보조 말뚝 번호.
	 */
	
	public static void move(int n, int i, int j, int k) throws IOException {
		// 종료 조건 : n == 0
		if(n > 0) { 
			move(n-1, i, k, j);
			bw.write(i + " " + j + "\n");
			move(n-1, k, j, i);
		}
	}

}
