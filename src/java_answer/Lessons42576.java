package java_answer;

import java.util.HashMap;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class Lessons42576 {
    public static void main(String[] args) {
        String[] participant = {"leo", "leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden", "leo", "leo"};
        System.out.println((new Lessons42576()).solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> completionMap = getHashMap(completion);

        for(String people: participant) {
            if (completionMap.getOrDefault(people, 0) < 1) {
                answer = people;
            } else {
                completionMap.replace(people, completionMap.get(people) - 1);
            }
        }
        return answer;
    }

    private HashMap<String, Integer> getHashMap(String[] strArray) {

        HashMap<String, Integer> map = new HashMap<>();
        for(String str : strArray) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        return map;
    }
}
