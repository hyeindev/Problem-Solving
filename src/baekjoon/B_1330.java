package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1330 {
	public static void main(String[] args) throws Exception{
		
 BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		 
		 String input = buffer.readLine();
		 String[] numberArray = new String[2];
		 numberArray = input.split(" ");
		 
		 int num1 = Integer.parseInt(numberArray[0]);
		 int num2 = Integer.parseInt(numberArray[1]);
		 
		 if (num1==num2) {
			System.out.println("==");
		}else if(num1>num2) {
			System.out.println(">");
		}else {
			System.out.println("<");
		}
	}

}
