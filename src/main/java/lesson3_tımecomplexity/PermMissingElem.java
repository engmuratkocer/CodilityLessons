package lesson3_tımecomplexity;

public class PermMissingElem {

    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        int A[] = {1,2,3};
        int res = permMissingElem.solution_2(A);

        System.out.println(res);
    }

    private int solution_2(int[] a) {

        if (a.length == 0)
            return 0;

        int missingNumber = 0;
        for (int i = 1; i < a.length+1 ; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]){
                    found = true;
                    break;
                }
            }

            if (!found){
                missingNumber = i;
                break;
            }

        }
        return missingNumber;
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
