package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_5543 {
	public static void main(String[] args) throws Exception {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[3];
		int[] arr2 = new int[2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(input.readLine());
		}
		arr2[0] = Integer.parseInt(input.readLine());
		arr2[1] = Integer.parseInt(input.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
			if (arr2[0] > arr2[1]) {
				int temp = arr2[0];
				arr2[0] = arr2[1];
				arr2[1] = temp;
			}

			int result = arr[0] + arr2[0] - 50;

			System.out.println(result);
		}
	}

