package lesson6_sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{1,2,3,4,5,6,7,6,5,4}));
    }

    public static int solution(int[] A) {

        Set<Integer> arrSet = new HashSet<>();

        if(A.length > 100000 || A ==null || A.length == 0)
            return -1;

        for(int a: A)
        {
            if(a < -1000000|| a > 1000000 )
                return -1;

            arrSet.add(a);
        }

        return arrSet.size();
    }
}
