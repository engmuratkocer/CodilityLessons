package lesson1_iterations;

import static java.lang.Integer.max;

public class BinaryGap {


    public static void main(String[] args) {

        int N = 8;

        int gap = solution(N);

        System.out.println(" binaryGap : " + gap);

    }

    private static int solution(int n) {
            int counter = 0;
            int max = 0;

            if (n != 0 && (n & 1) == 0) {
                n >>= 1;
            }

            if (n == 0)
                return 0;

            while (n != 1) {
                if ((n & 1) == 0) {
                    counter++;
                } else {
                    max = max(max, counter);
                    counter = 0;
                }
                n >>= 1;
            }

            return max;
    }


}
