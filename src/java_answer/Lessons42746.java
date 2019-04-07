package java_answer;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 */
public class Lessons42746 {
    public static void main(String[] args) {
        int[] numbers = {0, 10, 1, 101, 1000};
        System.out.println((new Lessons42746()).solution(numbers));
    }

    public String solution(int[] numbers) {
        List<String> list = IntStream.of(numbers).mapToObj(String::valueOf)
                .sorted(this::comparator).collect(Collectors.toList());

        StringBuilder answersBuilder = new StringBuilder();

        for (String i : list) {
            answersBuilder.append(i);
        }

        if (answersBuilder.toString().startsWith("0"))
            return "0";

        return answersBuilder.toString();
    }

    private int comparator(String a, String b) {
        return (a + b).compareTo(b + a);
    }

}
