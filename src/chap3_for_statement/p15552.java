package chap3_for_statement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		
		int t = Integer.parseInt(s);
		
		for(int i = 0; i < t; i++) {
			String str = bf.readLine();
			String [] strArray = str.split(" ");
			int a = Integer.parseInt(strArray[0]);
			int b = Integer.parseInt(strArray[1]);
			bw.write((a+b) + "\n");
		}
		bw.flush();
		bw.close();
	}

}
