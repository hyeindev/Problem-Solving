package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_2884 {

	public static void main(String[] args) throws Exception{
			
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String str = input.readLine();
			
			String[] strarray = str.split(" ");
			
			int H = Integer.parseInt(strarray[0]);
			int M = Integer.parseInt(strarray[1]);
			
			if(H>0) {
			
			if (M-45 <0) {
					M = 45-M;
					System.out.println((H-1) + " " + (60-M));
			}
			else {
					System.out.println(H + " " + (M-45));
			}	
		} else {
				
				if (M-45 <0) {
					H=24;
					M = 45-M;
					System.out.println((H-1) + " " + (60-M));
			}
			else {
					System.out.println(H + " " + (M-45));
			}	
				
			
		}
		
	}

}
