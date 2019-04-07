package java_answer;

import java.util.*;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/43162
 */
public class Lessons43162 {
    public static void main(String[] args) {
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        int n = 3;
        System.out.println((new Lessons43162()).solution(n, computers));
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        Queue<Integer> networkQueue = new PriorityQueue<>();
        Set<Integer> check = new HashSet<>();

        for (int i=0; i<n; i++) {
            answer += visit(i, networkQueue, check, computers);
        }

        return answer;
    }

    private int visit(int n, Queue<Integer> networkQueue, Set<Integer> check, int[][] computers) {
        if (check.contains(n)) return 0;

        int[] computer = computers[n];

        check.add(n);

        for(int i=0; i<computer.length; i++) {
            if (computer[i] == 1 && !check.contains(i))
                networkQueue.add(i);
        }

        for (int i=0; i<networkQueue.size(); i++) {
            visit(networkQueue.remove(), networkQueue, check, computers);
        }

        return 1;
    }
}
