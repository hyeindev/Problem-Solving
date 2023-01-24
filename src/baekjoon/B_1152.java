package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B_1152 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String input = buf.readLine();

		String[] strArr = input.split(" ");
		
		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals("")) continue;
			strList.add(strArr[i]);
		}
		System.out.println(strList.size());
	}

}
