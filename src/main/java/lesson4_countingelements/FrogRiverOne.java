package lesson4_countingelements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {

        int A[] = {1, 3, 1, 4, 2, 3, 5, 4};
        int k = 5;
        System.out.println(solution_3(k, A));

    }

    private static int solution_3(int X, int[] A) {

            int steps = X;
            boolean[] bitmap = new boolean[steps+1];
            System.out.println(bitmap);
            for(int i = 0; i < A.length; i++){
                if(!bitmap[A[i]]){
                    bitmap[A[i]] = true;
                    steps--;
                    if(steps == 0) return i;
                }

            }
            return -1;

    }

    private static int solution_2(int k, int[] a) {

        if (k <= 0)
            return 0;

        if (a.length < k)
            return -1;

        Set jumpSet = new HashSet();

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= k) {
                jumpSet.add(a[i]);
                if (jumpSet.size() == k) {
                    return i;
                }
            }
        }

        return -1;
    }








    public static int solution(int X, int[] A) {

        Set<Integer> allJumps = new HashSet<>();


        if (A.length < X) {
            return -1;
        }

        for (int i = 1; i <= X; i++) {
            allJumps.add(i);
        }

        for (int i = 0; i < A.length; i++) {

            allJumps.remove(A[i]);

            if (allJumps.isEmpty()) {
                return i;
            }

        }

        return -1;
    }

}
