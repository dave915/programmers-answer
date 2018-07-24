package java_answer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12939
 */
public class Lessons12939 {
    public static void main(String[] args) {
        out.println((new Lessons12939()).solution("-1 -4"));
    }

    private String solution(String s) {
        List<Integer> list = Arrays.stream(s.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int min = list.stream().min(Integer::compareTo).orElse(0);
        int max = list.stream().max(Integer::compareTo).orElse(0);

        return min + " " + max;
    }
}
