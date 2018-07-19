package java_answer;

import static java.lang.System.*;

/**
 * @author dave.th
 * 소수찾기 : https://programmers.co.kr/learn/courses/30/lessons/12921
 */
public class Lessons12921 {

    public static void main(String[] args) {
        out.println((new Lessons12921()).solution(10));
    }

    private int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++) {
            boolean r = true;
            for(int j=2; j <= Math.sqrt(i); j++){
                if(i%j == 0) {
                    r = false;
                    break;
                }
            }
            if(r) answer++;
        }
        return answer;
    }
}
