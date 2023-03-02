package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1541 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), "-");
		
		int sum = Integer.MAX_VALUE;
		
		while(st.hasMoreTokens()) {
			int tmp = 0;
			
			StringTokenizer check = new StringTokenizer(st.nextToken(), "+");
			
			while(check.hasMoreTokens()) {
				tmp += Integer.parseInt(check.nextToken());
			}
			
			if(sum == Integer.MAX_VALUE) {
				sum = tmp;
			}
			else {
				sum -= tmp;
			}
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}

}
