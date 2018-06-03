package lesson3_tımecomplexity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {

    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        int A[] = {3, 1, 2, 4, 7, 6};
        int k = 3;
        int res = permMissingElem.solution(A);

        System.out.println(res);
    }

    public int solution(int[] A) {




        int sum = 0;


        for (int v:
             A)
        {
            sum += v;
        }

        int length = A.length+1;

        int sumNeedToBe =  length*(length+1)/2;

        return (sumNeedToBe-sum);

    }

//    public int solution(int[] A) {
//
//        if (A.length == 0)
//            return 1;
//
//        if (A.length == 1)
//            return 1;
//
//        if (A.length > 100000 || A.length < 0)
//        {
//            return 0;
//        }
//
//        Set<Integer> elmSet = initElmSet(A);
//
//        for (int i = 0; i < A.length; i++) {
//            if (elmSet.contains(i + 1) == false)
//                return i + 1;
//        }
//
//        return 0;
//    }
//
//    private Set<Integer> initElmSet(int A[]) {
//        Set<Integer> elmSet = new HashSet<>();
//
//        for (int elm : A) {
//            elmSet.add(elm);
//        }
//
//        return elmSet;
//    }
}
