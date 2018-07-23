package java_answer;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12945
 */
public class Lessons12945 {
    public static void main(String[] args) {
        System.out.println((new Lessons12945()).solution(10000));
    }

    private int solution(int n) {
        Map<Integer, BigInteger> map = new HashMap<>();
        map.put(0, BigInteger.valueOf(0));
        map.put(1, BigInteger.valueOf(1));

        for(int i=0; i <= n; i++)
           fibo(i, map);

        return Integer.valueOf(map.get(n).mod(BigInteger.valueOf(1234567)).toString());
    }

    private BigInteger fibo(int n, Map<Integer, BigInteger> map) {
        if(n == 0 || n == 1) return BigInteger.valueOf(n);
        if(map.containsKey(n)) return map.get(n);

        BigInteger result = fibo(n - 1, map).add(fibo(n - 2, map));
        map.put(n, result);
        return result;
    }
}
