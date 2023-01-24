package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class B_1157 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String in = buf.readLine();
		String input = in.toUpperCase();
		
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		int count = 1;
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else map.put(ch, count);
		}
		
		Iterator<Integer> iter = map.values().iterator();
		int benchmark = 0;
		int it = 0;
		while(iter.hasNext()) {
			if (benchmark<(it=iter.next())) benchmark = it;
		}
		ArrayList<Character> arrayList = new ArrayList<Character>();
		
		for(Character key : map.keySet()) {
			if (map.get(key)==benchmark) {
				arrayList.add(key);
			}
		}
		
		if (arrayList.size()!=1) {
			System.out.println("?");
		}else System.out.println(arrayList.get(0));
		
	}

}
