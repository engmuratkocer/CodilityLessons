package lesson4_countingelements;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {


    public static void main(String[] args) {

        PermCheck permCheck = new PermCheck();

        int A[] = {2};

        System.out.println(permCheck.solution(A));

    }

    public int solution(int[] A) {

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
