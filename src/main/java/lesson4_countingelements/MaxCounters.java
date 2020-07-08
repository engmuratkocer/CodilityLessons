package lesson4_countingelements;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Murat Kocer
 * @since 07/07/2020
 */
public class MaxCounters {

    public static void main(String[] args) {

        int A[] = new int[7];
        A[0] = 3;
        A[1] = 4;
        A[2] = 4;
        A[3] = 6;
        A[4] = 1;
        A[5] = 4;
        A[6] = 4;

        int result []= solution(5, A);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] solution(int N, int[] A) {

        int counterArr[] = new int[N];

        int maxCounter = 0;
        for (int i = 0; i < A.length; i++) {
            int val = A[i];

            if (val >= 1 && val <=N){
                counterArr[val-1] = counterArr[val-1] + 1;
                int max = counterArr[val-1];
                maxCounter = Integer.max(max, maxCounter);
            }else if (val == (N + 1)){
                for (int j = 0; j < N; j++) {
                    counterArr[j] = maxCounter;
                }
            }
        }
        return counterArr;
    }

}
