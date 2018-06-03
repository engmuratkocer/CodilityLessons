package lesson4_countingelements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {

        int A[] = {1, 3, 1, 4, 2, 3, 5, 4};
        int k = 5;
        System.out.println(solution(k, A));

    }

    public static int solution(int X, int[] A) {

        Set<Integer> allJumps = new HashSet<>();


        if (A.length < X)
            return -1;

        for (int i = 1; i <= X; i++) {
            allJumps.add(i);
        }

        for (int i = 0; i < A.length; i++) {

            allJumps.remove(A[i]);

            if (allJumps.isEmpty())
                return i;

        }

        return -1;
    }

}
