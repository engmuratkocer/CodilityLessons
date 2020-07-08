package lesson9_maximumslide;

public class MaxSlideSum {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{3, 2, -6, 4, 0,}));
//        System.out.println(solution(new int[]{3, 2, -6, 7, 0,}));
//        System.out.println(solution(new int[]{1}));

    }

//    public static int solution(int[] A) {
//
//        if (A == null || A.length == 0) {
//            return 0;
//        }
//
//        int untilSum = 0;
//        int maxSliceSum = A[0];
//
//        for (int i = 0; i < A.length; i++) {
//            String str = "";
//            untilSum = 0;
//            for (int j = i; j < A.length; j++) {
//                untilSum = A[j] + untilSum;
//                maxSliceSum = Math.max(untilSum, maxSliceSum);
//            }
//        }
//
//        return maxSliceSum;
//    }

    public static int solution(int[] A) {
        int maxEndingHere = A[0];
        int maxSoFar = A[0];
        for(int i = 1; i < A.length; i++){
            maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

}