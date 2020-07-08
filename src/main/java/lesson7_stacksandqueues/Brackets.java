package lesson7_stacksandqueues;

import java.util.*;

public class Brackets {

    public static void main(String[] args) {

        System.out.println(solution("()"));
        System.out.println(solution("{[()()]}"));
        System.out.println(solution("([)()]"));
    }

    public static int solution(String S) {

        if (S == null || S.length() == 0 || S.length() > 200000)
            return 0;

        Stack<Character> brackets = new Stack<Character>();
        boolean isNested = true;

        for (Character C : S.toCharArray()) {
            if (C == '{' || C == '[' || C == '(') {
                brackets.push(C);
            } else {
                if (brackets.isEmpty()) {
                    isNested = false;
                    break;
                }

                Character popped = brackets.pop();
                if (C == '}' && popped == '{' || C == ']' && popped == '[' || C == ')' && popped == '(') {
                    continue;
                } else {
                    isNested = false;
                    break;
                }
            }
        }

        if (brackets.isEmpty() == false) {
            isNested = false;
        }

        return isNested ? 1 : 0;
    }
}
