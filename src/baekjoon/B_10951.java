package baekjoon;

import java.util.Scanner;

public class B_10951 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int fir = sc.nextInt();
			int sec = sc.nextInt();

			System.out.println(fir + sec + "\n");
		}

		sc.close();

	}

}
