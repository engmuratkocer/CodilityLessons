package lesson4_countingelements;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MissingInteger {

    @Test
    public static void main(String[] args) {
        assertEquals(3, solution_2(new int[] {2, 1, 5, 6}));
        assertEquals(4, solution_2(new int[] {2, 1, 3, 5}));
        assertEquals(1, solution_2(new int[] {2, 3, 4, 5}));
        assertEquals(4, solution_2(new int[] {2, 3, 1}));
        assertEquals(9, solution_2(new int[] {2, 1, 3, 4, 5, 6, 7, 8, 10}));
    }

    private static int solution_3(int[] A) {

        boolean found;
        int missing = 0;
        for (int i = 1; i <= A.length; i++) {
            found = false;
            for (int j = 0; j < A.length; j++) {
                if (A[j] < 0) {
                    return 1;
                }
                if (i == A[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missing = i;
                break;
            }else if (i == A.length){
                missing = A.length + 1;
            }
        }
        return missing;
    }

    public static int solution_4(int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        boolean found = false;
        for (int i = 1; i < A.length + 1; i++) {
            if (set.contains(i) == false) {
                found = true;
                return i;
            }
        }

        if (!found){
            return A.length + 1;
        }

        return 1;
    }

    public static int solution_2(int[] A) {

        boolean bol[] = new boolean[A.length+2];

        for (int i = 0; i <A.length; i++) {
            if (A[i] < bol.length && A[i] > 0 )
                bol[A[i]] = true;
        }

        for (int i = 1; i < bol.length; i++) {
            System.out.println(bol[i]);
        }

        for (int i = 1; i < bol.length; i++) {
            if (bol[i] == false){
                return i;
            }
        }
        return 1;
    }

}
