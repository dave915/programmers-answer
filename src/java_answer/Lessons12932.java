package java_answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 */
public class Lessons12932 {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println((new Lessons12932()).solution(n));
    }

//    public int[] solution(long n) {
//        String str = String.valueOf(n);
//        List<String> strings = Arrays.asList(str.split(""));
//        Collections.reverse(strings);
//        return strings.stream().mapToInt(Integer::valueOf).toArray();
//    }

    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        String[] strArray = str.split("");

        for (int i=0; i < strArray.length; i++) {
            answer[i] = Integer.parseInt(strArray[strArray.length - i - 1]);
        }

        return answer;
    }

}
