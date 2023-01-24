package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_4344 {
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(input.readLine());

		int total = 0;
		double average = 0;
		int aStu = 0;
		int stuNum = 0;
		double[] resultStu = new double[testCase];

		for (int i = 0; i < testCase; i++) {
			String[] gradeArr = input.readLine().split(" ");
			stuNum = Integer.parseInt(gradeArr[0]);

			for (int j = 1; j < gradeArr.length; j++) {

				total += Integer.parseInt(gradeArr[j]);
			}

			average = total / stuNum;

			for (int k = 1; k < gradeArr.length; k++) {
				if (Integer.parseInt(gradeArr[k]) > average) {

					aStu++;
				}
			}

			resultStu[i] = (double) aStu / stuNum * 100;

			average = 0;
			total = 0;
			stuNum = 0;
			aStu = 0;

		}

		for (int i = 0; i < resultStu.length; i++) {

			System.out.println(String.format("%.3f", resultStu[i]) + "%");
		}

	}

}
