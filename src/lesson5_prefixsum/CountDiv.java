package lesson5_prefixsum;

public class CountDiv {

    public static void main(String[] args) {

        System.out.println(solution(6,13,12));

    }

    public static int solution(int A, int B, int K) {

        if(A%K == 0)
            return (B-A)/K+1;
        else
            return (B-(A-A%K))/K;

    }
}