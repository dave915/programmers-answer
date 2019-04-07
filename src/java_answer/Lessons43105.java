package java_answer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/43105
 */
public class Lessons43105 {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println((new Lessons43105()).solution(triangle));
    }

    public int solution(int[][] triangle) {
        int[][] cache = new int[triangle.length][triangle.length];
        return getMax(0, 0, triangle, cache);
    }

    private int getMax(int index, int height, int[][] triangle, int[][] cache) {
        int[] array = triangle[height];
        if (height == triangle.length - 1) return array[index];

        if (cache[index][height] > 0) return cache[index][height];

        int left = array[index] + getMax(index, height + 1, triangle, cache);
        int right = array[index] + getMax(index + 1, height + 1, triangle, cache);
        int max = left > right ? left : right;

        cache[index][height] = max;

        return max;
    }
}
