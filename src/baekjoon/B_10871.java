package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_10871 {
	public static void main(String[] args) throws Exception {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String[] str = input.readLine().split(" ");
		String[] str2 = input.readLine().split(" ");

		int num2[] = new int[str2.length];

		int leng = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);

		for (int i = 0; i < leng; i++) {
			num2[i] = Integer.parseInt(str2[i]);
			if (num2[i] < n) {
				System.out.print(num2[i] + " ");
			}
		}

	}

}
