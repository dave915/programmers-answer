package java_answer;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 */
public class Lessons12922 {
    public static void main(String[] args) {
        System.out.println((new Lessons12922()).solution(5));
    }

    private String solution(int n) {
        String answer = "";

        for(int i=1; i<=n/2; i++){
            answer += "수박";
        }
        if(n%2 != 0)
            answer += "수";

        return answer;
    }
}
