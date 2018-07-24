package java_answer;

import static java.lang.System.out;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12951
 */
public class Lessons12951 {
    public static void main(String[] args) {
        out.println((new Lessons12951()).solution("3people  uuunFollowed me "));
    }

    private String solution(String s) {
        String[] arr = s.toLowerCase().split(" ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length() > 0)
                arr[i] = arr[i].replaceFirst(String.valueOf(arr[i].charAt(0)), String.valueOf(arr[i].charAt(0)).toUpperCase());
        }


        return s.lastIndexOf(" ") == s.length() -1 ? String.join(" ", arr) + " " : String.join(" ", arr);
    }
}
