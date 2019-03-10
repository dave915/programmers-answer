package java_answer;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */
public class Lessons42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println((new Lessons42748()).solution(array, commands));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for(int[] command : commands) {
            answer[index++] = getNumber(array, command);
        }

        return answer;
    }

    private int getNumber(int[] array, int[] command) {
        int[] subArray = IntStream.of(Arrays.copyOfRange(array, command[0] - 1, command[1]))
                .sorted()
                .toArray();
        return subArray[command[2] - 1];
    }

}
