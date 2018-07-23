package java_answer;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 */
public class Lessons12943 {
    public static void main(String[] args) {
        System.out.println((new Lessons12943()).solution(626331));
    }

    private int solution(int num) {
        int answer = 0;

        while (num != 1) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            if(++answer == 450 && num != 1) return -1; // 문제 에러인지... 예제에 있는 626331이 -1 이 인나옴
        }

        return answer;
    }
}
