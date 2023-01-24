package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_15552 {
	public static void main(String[] args) throws Exception{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(input.readLine());
		
		for (int i = 0; i < n; i++) {
			
			String[] str = input.readLine().split(" ");
			int fir = Integer.parseInt(str[0]);
			int sec = Integer.parseInt(str[1]);
			
			output.write(fir+sec+"\n");
		}
		
		output.flush();
		output.close();
		input.close();
}
}