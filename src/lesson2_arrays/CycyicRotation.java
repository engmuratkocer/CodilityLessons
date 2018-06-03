package lesson2_arrays;

public class CycyicRotation {

    public static void main(String[] args) {

        CycyicRotation cycyicRotation = new CycyicRotation();


        int a[] = {3, 2, 6, 7};
        int rotate = 3;
        int res[] = cycyicRotation.solution(a, rotate);

        System.out.println("{ ");
        String cycledArr = "";
        for (int i = 0; i < res.length; i++) {
            cycledArr += res[i] + " ,";
        }
        System.out.println(cycledArr + " }");

    }

    public int[] solution(int[] A, int K) {

        int arrayLength = A.length;
        int shiftCount = K % arrayLength;

        if (validateInputs(A, K, arrayLength)) return null;

        if (shiftCount == 0 || K == 0) {
            // no need to rotate
            return A;
        }

        for (int j = 0; j < shiftCount; j++) {
            int tmp = A[arrayLength - 1];
            for (int i = arrayLength - 1; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = tmp;
        }

        return A;
    }

    private boolean validateInputs(int[] A, int K, int arrayLength) {
        int minRange = 0;
        int maxRange = 1000;
        int minArrRange = -1000;
        int maxArrRange = 1000;

        if (A == null || A.length == 0) {
            System.out.println(" Empty or null arrays cannot be rotated.");
            return true;
        }

        if (K > 1000 || K < 0 || arrayLength > 1000 || arrayLength < 0) {
            System.out.println("Length of the array and rotation number should be within range " + minRange + " and " + maxRange);
            return true;
        }

        for (int i = 0; i < arrayLength; i++) {
            if (A[i] < -1000 || A[i] > 1000) {
                System.out.println(" Array elements should be within range " + minArrRange + " and " + maxArrRange + " element A[" + i + "] is out of range");
                return true;
            }
        }
        return false;
    }
}
