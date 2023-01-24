package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_2741 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(input.readLine().trim());
		
		for (int i = 1; i < n+1; i++) {
			output.write(i+"\n");
		}
		
		output.flush();
		output.close();
		input.close();
		
	}

}
