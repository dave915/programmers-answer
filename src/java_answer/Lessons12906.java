package java_answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */
public class Lessons12906 {

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        out.println(Arrays.toString((new Lessons12906()).solution(arr)));
    }

    private int[] solution(int []arr) {
        List<Integer> array = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(i == 0) {
                array.add(arr[i]);
                continue;
            }

            if(arr[i-1] != arr[i])
                array.add(arr[i]);

        }

        int[] answer = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            answer[i] = array.get(i);
        }

        return answer;
    }
}
