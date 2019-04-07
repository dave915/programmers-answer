package java_answer;



/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12900
 */
public class Lessons12900 {
    public static void main(String[] args) {
        System.out.println((new Lessons12900()).solution(4));
    }

    public int solution(int n) {
        return fibo(n);
    }

    public int fibo(int n) {
        int first = 1;
        int second = 1;

        if (n == 0) return first;
        if (n == 1) return second;

        for (int i=2; i<=n; i++) {
            int temp = first + second;
            first = second;
            second = temp % 1000000007;
        }

        return second;
    }

}
