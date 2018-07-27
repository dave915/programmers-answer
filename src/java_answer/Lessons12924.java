package java_answer;

import static java.lang.System.out;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12924
 */
public class Lessons12924 {
    public static void main(String[] args) {
        out.println((new Lessons12924()).solution(15));
    }

    private int solution(int n) {
       int count = 0;
       for(int i=1; i<=n; i++){
           int sum = 0;
           for(int j = i; j<=n && sum < n; j++){
               sum += j;
               if(sum == n) count++;
           }
       }

       return count;
    }
}
