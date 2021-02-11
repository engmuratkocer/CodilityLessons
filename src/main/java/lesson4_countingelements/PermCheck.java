package lesson4_countingelements;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class PermCheck {

    public static void main(String[] args) {

        PermCheck permCheck = new PermCheck();

        int solution = solution(new int[]{2, 1, 3,4});
        System.out.println(solution);
        assertEquals(1, solution);

        solution = solution(new int[]{2, 1, 5,4});
        System.out.println(solution);
        assertEquals(0, solution);

    }

    public static int solution(int[] A) {

        boolean bol[] = new boolean[A.length+1];

        for (int i = 0; i <A.length; i++) {
            if (A[i] < bol.length && A[i] > 0 )
                bol[A[i]] = true;
        }

        for (int i = 1; i < bol.length; i++) {
            if (bol[i] == false){
                return 0;
            }
        }
        return 1;
    }

    public int solution_3(int[] A) {

        Set<Integer> arrSet = new HashSet<>();

        for (int elm : A) {
            arrSet.add(elm);
        }

        for (int i = 1; i < A.length+1; i++) {
            if (arrSet.contains(i) == false)
                return 0;
        }

        return 1;
    }
}
