package java_answer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 */
public class Lessons42862 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println((new Lessons42862()).solution(n, lost, reserve));
    }

    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = IntStream.of(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = IntStream.of(reserve).boxed().collect(Collectors.toList());
        removeSame(lostList, reserveList);
        removeLostByReserveSide(lostList, reserveList);

        return n - lostList.size();
    }

    private void removeSame(List<Integer> lost, List<Integer> reserve) {
        // 도둑 많은 인원중 여벌 갖고온 인원 제거
        List<Integer> removeList = new ArrayList<>();
        for (Integer i : reserve) {
            if (lost.contains(i)) {
                removeList.add(i);
                lost.remove(i);
            }
        }

        reserve.removeAll(removeList);
    }

    private void removeLostByReserveSide(List<Integer> lost, List<Integer> reserve) {
        for (Integer i : reserve) {
            Integer left = i - 1;
            if (lost.remove(left))
                continue;

            Integer right = i + 1;
            lost.remove(right);
        }
    }
}
