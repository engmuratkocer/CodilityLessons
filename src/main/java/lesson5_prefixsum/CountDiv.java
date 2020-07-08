package lesson5_prefixsum;

import sun.jvm.hotspot.utilities.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CountDiv {

    public static void main(String[] args) {

        assertThat(solution_2(1, 3, 2) , equalTo(1));
        assertThat(solution_2(6, 13, 12) , equalTo(1));
        assertThat(solution_2(6, 11, 2) , equalTo(3));
        assertThat(solution_2(6, 24, 12) , equalTo(2));
        assertThat(solution_2(6, 24, 2) , equalTo(10));

    }

    private static int solution(int a, int b, int K) {

        if (b < K) {
            return 0;
        }

        int upSum = b / K;
        int subSum = a / K;
        int result = upSum - subSum;

        if (a >= K && a%K == 0){
            result += 1;
        }

        return result;
    }

    public static int solution_2(int A, int B, int K) {
        if (A % K == 0) {
            return (B - A) / K + 1;
        } else {
            return (B - (A - A % K)) / K;
        }
    }

}
