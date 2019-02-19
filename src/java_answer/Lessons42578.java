package java_answer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/42578
 */
public class Lessons42578 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"yellow_hat", "headgear"}};
        System.out.println((new Lessons42578()).solution(clothes));
    }

    public int solution(String[][] clothes) {
        Map<String, List<String>> clothesMap = getClothesMap(clothes);

        return getCount(clothesMap);
    }

    private int getCount(Map<String, List<String>> clothesMap) {
        int result = 1;

        for (String key : clothesMap.keySet()) {
            int count = clothesMap.get(key).size() + 1;
            result *= count;
        }

        return result - 1;
    }

    private Map<String, List<String>> getClothesMap(String[][] clothes) {
        Map<String, List<String>> clothesMap = new HashMap<>();
        for(String[] array : clothes) {
            String type = array[1];
            String value = array[0];

            if (clothesMap.containsKey(type)) {
                clothesMap.get(type).add(value);
            } else {
                List<String> values = new ArrayList<>();
                values.add(value);
                clothesMap.put(type, values);
            }
        }

        return clothesMap;
    }
}
