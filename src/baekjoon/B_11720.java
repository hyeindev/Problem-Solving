package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_11720 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String input = buf.readLine();
		String input2 = buf.readLine();
		int sum = 0;

		int n = Integer.parseInt(input);
		for (int i = 0; i < n; i++) {
			sum += (int) input2.charAt(i) - 48;
		}

		System.out.println(sum);
	}

}
