import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Baekjoon_1152_Regex throws Exception{
	public static void main(String[] args) throws Exception{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String input = buf.readLine();
		String regexVal = "[^\\s]+";
		
		ArrayList<String> strList = new ArrayList<String>();
		Pattern pattern = Pattern.compile(regexVal);
		Matcher matcher = pattern.matcher(input);
		while(matcher.find()) {
			strList.add(matcher.group());
		}
		System.out.println(strList.size());
		
		
		
	}
}
