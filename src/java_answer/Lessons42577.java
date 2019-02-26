package java_answer;

import java.util.*;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */
public class Lessons42577 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "223", "11929292"};
        System.out.println((new Lessons42577()).solution(phone_book));
    }

    public boolean solution(String[] phone_book) {
        List<String> phoneBookList = Arrays.asList(phone_book);
        Set<String> phoneBookSet = new HashSet<>(phoneBookList);

        return getResult(phoneBookList, phoneBookSet);
    }

    private boolean getResult(List<String> phoneBookList, Set<String> phoneBookSet) {
        for(String str: phoneBookList) {
            for (int i=0; i< str.length(); i++) {
                if (phoneBookSet.contains(str.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }


}
