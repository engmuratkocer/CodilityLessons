package lesson7_stacksandqueues;

import java.util.Stack;

public class StoneWall {

    public static void main(String[] args) {

//        System.out.println(solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}));
//        System.out.println(solution(new int[]{1, 2, 3, 3, 2, 1}));
        System.out.println(solution(new int[]{1}));


    }

    private static int solution(int A[]) {

        int tileNumber = 0;
        Stack<Integer> tileStack = new Stack<>();

        for (int v : A) {
            if (tileStack.isEmpty() || v > tileStack.peek()) {
                tileStack.push(v);
            } else {
                while (tileStack.isEmpty() == false && v < tileStack.peek()) {
                    int tmp = tileStack.pop();
                    while (tileStack.isEmpty() == false && tmp == tileStack.peek()) {
                        tileStack.pop();
                    }
                    tileStack.push(v);
                    tileNumber++;
                }
            }
        }


        while (tileStack.isEmpty() == false && 0 < tileStack.peek()) {
            int tmp = tileStack.pop();
            while (tileStack.isEmpty() == false && tmp == tileStack.peek()) {
                tileStack.pop();
            }
            tileNumber++;
        }
        return tileNumber;

    }

}


