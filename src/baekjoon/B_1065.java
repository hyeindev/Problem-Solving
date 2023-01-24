package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B_1065 {
	public static void main(String[] args) throws Exception{

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String input = buf.readLine();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int hanNumcount = 0;
		int beforeBenchmark = 0;
		int nextBenchmark = 0;
		
		for (int i = 1; i <= Integer.parseInt(input); i++) {

			int iLeng = (i + "").length();

			beforeBenchmark = (int) (i + "").charAt(0);

			if (iLeng == 1 || iLeng == 2) {
				hanNumcount++;
			} else {
				
				for (int k = 1; k < iLeng; k++) {

					nextBenchmark = (int) (i + "").charAt(k);
					map.put(beforeBenchmark - nextBenchmark, 0);
					beforeBenchmark = nextBenchmark;
				}
			}
			
			if (map.size() == 1) hanNumcount++;
			
			map.clear();
		}
		System.out.println(hanNumcount);
	}

}
