package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1000 {
	
	public static void main(String[] args) throws Exception{
		
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	String str = input.readLine();
	str = str.replaceAll(" ", "");
	
	int A = str.charAt(0) - '0';
	int B = str.charAt(1) - '0';
	
	System.out.println(A+B);
	
	}

}
