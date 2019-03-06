package java_answer;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */
public class Lessons42840 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5, 1,2,3,4,5};
        System.out.println((new Lessons42840()).solution(answers));
    }

    public int[] solution(int[] answers) {
        int[] user1 = {1, 2, 3, 4, 5};
        int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] count = getUsersCount(answers, user1, user2, user3);
        return getMaxUsers(count);
    }

    private int[] getUsersCount(int[] answers, int[]... users) {
        int[] count = new int[users.length];

        for (int i=0; i < answers.length; i++) {
            for (int j = 0; j < users.length; j++) {
                int userIndex = i % users[j].length;
                if (users[j][userIndex] == answers[i])
                    count[j]++;
            }
        }

        return count;
    }

    private int[] getMaxUsers(int[] count) {
        int max = Arrays.stream(count).max().getAsInt();

        return IntStream.range(1, count.length + 1)
                .filter(i -> count[i - 1] == max)
                .toArray();
    }
}
