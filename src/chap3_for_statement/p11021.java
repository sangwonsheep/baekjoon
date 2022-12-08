package chap3_for_statement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11021 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int t = Integer.parseInt(s);
		
		for(int i = 0; i < t; i++) {
			String ab = br.readLine();
			String [] array = ab.split(" ");
			int a = Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[1]);
			bw.write("Case #" + (i+1) + ": " + (a+b) + "\n");
		}
		bw.flush();
		bw.close();
	}

}
