package java_answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.lang.System.out;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */
public class Lessons12906 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        out.println(Arrays.toString((new Lessons12906()).solution(arr)));
    }

    private int[] solution(int[] arr) {
        List<Integer> array = new ArrayList<>();
        int preNum = -1;
        for (int num : arr) {
            if (preNum != num) {
                array.add(num);
            }
            preNum = num;
        }

        return array.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int[] solution2(int[] arr) {
        return IntStream.range(0, arr.length)
                .filter(i -> {
                    if (i == 0) return true;
                    return arr[i - 1] != arr[i];
                }).map(i -> arr[i])
                .toArray();
    }
}
