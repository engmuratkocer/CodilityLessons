package lesson3_tımecomplexity;

public class TapeEquilibrium {

    public static void main(String[] args) {

        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int A[] = {3, 1, 2, 4, 3};
        int k = 3;
        int res = tapeEquilibrium.solution(A);

        System.out.println(res);

    }

    private int solution(int[] A) {

        int arrSum = 0;
        int minDiff = 0;
        int diff = 0;
        int leftSum = 0;
        boolean isFirst = true;

        arrSum = calculateArraySum(A, arrSum);

        for (int j = 1; j < A.length; j++) {
            leftSum += A[j - 1];
            diff = Math.abs(leftSum - (arrSum - leftSum));
            if (isFirst) {
                minDiff = diff;
                isFirst = false;
            }
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    private int calculateArraySum(int[] A, int arrSum) {
        for (int i = 0; i < A.length; i++) {
            arrSum += A[i];
        }
        return arrSum;
    }


}