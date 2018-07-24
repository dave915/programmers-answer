package java_answer;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12909
 */
public class Lessons12909 {
    public static void main(String[] args) {
        System.out.println((new Lessons12909()).solution("()()"));
    }

    private boolean solution(String s) { // 스택 사용시 시간초과떠서 카운팅 변수 하나만 사용
        int count = 0;
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
            if("(".charAt(0) == arr[i]) {
                count++;
            } else {
                if(count == 0) return false;
                count--;
            }
            if(count > arr.length - i) return false;
        }
        return count == 0;
    }
}
