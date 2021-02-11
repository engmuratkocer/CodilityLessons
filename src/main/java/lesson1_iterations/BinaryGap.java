package lesson1_iterations;

import static java.lang.Integer.max;

public class BinaryGap {


    public static void main(String[] args) {

        int N = 1041;

        int gap = solution(N);

        System.out.println(Integer.toBinaryString(N) + " binary gap is: " + gap);

    }
    private static int solution(int n) {

        String binary = Integer.toBinaryString(n);
        boolean open = true;
        int maxCounter = 0;
        int counter = 0;
        for (char c:binary.toCharArray()
             ) {
            if (open && c == '1'){
                open = false;
            }else if (!open && c == '0'){
                counter++;
            }else if (!open && c == '1'){
                maxCounter = Math.max(counter, maxCounter);
                counter = 0;
            }
        }

        return maxCounter;
    }
    private static int solution_n(int n) {
        if (n == 0){
            return 0;
        }

        char []str = Integer.toBinaryString(n).toCharArray();


        boolean oneStart = false;
        int counter = 0;
        int max = 0;
        for (int i = 0; i < str.length; i++) {

             char chr = str[i];

            if (chr == '1' && oneStart == false){
                oneStart = true;
            }

            if (oneStart == true && chr == '0'){
                counter++;
            }

            if (chr == '1' && oneStart == true){
                max = max(counter, max);
                counter = 0;
            }

        }
        return max;
    }

    private static int solution_2(int n) {
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
