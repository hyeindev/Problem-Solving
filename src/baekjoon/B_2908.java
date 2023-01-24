package baekjoon;

import java.util.Arrays;

/**
 * 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 * 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
 */
public class B_2908 {

    private static int a = 9841;
    private static int b = 1235;

    public static void main(String[] args) {
        String str_1 = getReverseNumber(a);
        String str_2 = getReverseNumber(b);

        int bigNumber = compareNumber(Integer.parseInt(getStr(str_1)),Integer.parseInt(getStr(str_2)));
        System.out.println(bigNumber);
    }
    public static String getReverseNumber(int number) {
        String numberStr = number + "";
        String[] numberStrArray = new String[numberStr.length()];
        for (int i = 0; i < numberStrArray.length; i++) {
            String num = (numberStr.charAt(i)) + "";
            numberStrArray[numberStrArray.length - (i+1)] = num;
        }
        return Arrays.toString(numberStrArray);
    }

    public static String getStr(String numStr) {
        return numStr.replaceAll(",","").replaceAll("\\[","").replaceAll("]","").replaceAll(" ","");
    }

    public static int compareNumber(int a, int b) {
        if (a>b) {
            return a;
        }
        return b;
    }

}
