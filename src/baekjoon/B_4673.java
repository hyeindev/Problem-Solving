package baekjoon;

import java.util.HashSet;
import java.util.Iterator;

public class B_4673 {
	public static void main(String[] args) {

		HashSet<Integer> numList = new HashSet<Integer>();
		HashSet<Integer> inversionSelfNum = new HashSet<Integer>();

		int sum = 0;
		int i = 1;

		for (int j = 1; j <= 10000; j++) {
			numList.add(j);
		}

		while (i < 10000) {
			String strNum = "" + i;
			sum = i;
			for (int j = 0; j < strNum.length(); j++) {
				sum += ((int) strNum.charAt(j) - 48);
			}
			inversionSelfNum.add(sum);
			i++;
		}

		if (numList.removeAll(inversionSelfNum)) {
			Iterator<Integer> iter = numList.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
		}

	}

}
