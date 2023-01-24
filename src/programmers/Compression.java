package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/17684
 */

public class Compression {
    public static HashMap<String, Integer> compressionMap = new HashMap<>();
    public static String input = "TOBEORNOTTOBEORTOBEORNOT";
    public static ArrayList<Integer> valueBasket = new ArrayList<>();
    public static int lastValue;


    public static void setting() {
        int value = 1;
        for (char key = 'A'; key <= 'Z'; key++, value++) {
            compressionMap.put(key + "", value);
        }
        lastValue = value - 1;
    }

    public static void main(String[] args) throws Exception{
        setting();
        firKeyWhile();

        System.out.println(Arrays.toString(valueBasket.toArray()));
    }

    public static void firKeyWhile() throws InterruptedException {
        String searchKey = "";
        int startIndex = 0;
        int readIndex = 0;
        boolean exists = true;

        while(startIndex < input.length()) {
            while(exists) {
                if (isOverIndex(startIndex,readIndex)) {
                    readIndex++;
                    break;
                }
                searchKey+=input.charAt(startIndex + readIndex);
                if (!search(searchKey)) {
                    lastValue = lastValue + 1;
                    compressionMap.put(searchKey,lastValue);
                    System.out.println("등재 : " + searchKey + "/" +lastValue);
                    exists = false;
                }
                readIndex++;
            }
            valueBasket.add(compressionMap.get(input.substring(startIndex,(startIndex + readIndex -1))));

            startIndex = startIndex + readIndex -1;

            searchKey = "";
            readIndex = 0;
            exists = true;
        }
    }

    public static boolean search(String key) {
        Set<String> keys = compressionMap.keySet();
        if (!keys.contains(key)) {
            return false;
        }else {
            return true;
        }
    }

    public static boolean isOverIndex(int startIndex,int readIndex) {
        if (startIndex + readIndex >= input.length()) {
            return true;
        }
        return false;
    }

}
