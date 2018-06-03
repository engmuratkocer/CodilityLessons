package lesson12_euclidian;

import java.util.HashSet;
import java.util.Set;

public class ChocolateByNumber {

    public static void main(String[] args) {

        System.out.println(solution(10,4));
        System.out.println(solution(9,3));
          System.out.println(solution(24, 18));
        System.out.println(solution(12,21));

    }


    public static int solution(int N, int M) {

        boolean isSwapped = false;
        if ( N < M){
            int tmp = M;
            M = N;
            N =tmp;
            isSwapped = true;
        }


        int gcd =  gcd(N,M);

        if (isSwapped)
            return (M)/gcd;

        return (N)/gcd;
    }

    private static int gcd(int n, int m) {

        if (n%m != 0)
            return gcd(m, n%m);

        return m;
    }

    private static int rotatedIndex(int i , int m, int lastIndex){

        if((i+m) > lastIndex-1){
            return ((i+m)-lastIndex);
        }

        return i+m;
    }
}
