package lesson6_sorting;

public class Triangle {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{10, 2, 5, 1, 8, 20}));
        System.out.println(solution(new int[]{10, 50, 5, 1}));

    }

    public static int solution(int[] A) {

        if (A == null || A.length == 0 || A.length > 100000)
            return 0;

        int triangleFlag = 0;

        outerloopi:
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                for (int k = j+1; k < A.length; k++) {

                    int p = A[i];
                    int q = A[j];
                    int r = A[k];

                    if ((p+q) >r && (q+r) > p && (r+p) > q){
                        triangleFlag = 1;
                        break outerloopi;
                    }
                }
            }
        }

        return triangleFlag;
    }
}