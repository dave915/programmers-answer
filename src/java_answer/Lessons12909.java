package java_answer;

import java.util.Stack;

/**
 * @author dave.th
 * https://programmers.co.kr/learn/courses/30/lessons/12909
 */
public class Lessons12909 {
    public static void main(String[] args) {
        System.out.println((new Lessons12909()).solution("()()"));
    }

    private boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        int i=0;
        char[] arr = s.toCharArray();
        for(char c : arr) {
            if("(".charAt(0) == c) {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
            i++;

            if(stack.size() > arr.length - i) return false;
        }

        return stack.isEmpty();
    }
}
