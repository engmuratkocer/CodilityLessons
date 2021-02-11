package lesson2_arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {


    public static void main(String[] args) {

        int a[] = {9, 3, 9, 3, 9};
//        int a[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6};

        System.out.println(solution(a));
    }

    private static int solution(int[] a) {

        int counter = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (i != j && a[i] == a[j]) {
                    counter++;
                }
            }
            if (counter == 0 || (counter > 0 && counter % 2 == 0) ){
                return a[i];
            }
            counter = 0;
        }
        return 0;
    }

    private static int solution_(int[] a) {
        Set nonPairs = new HashSet();

        for (int i = 0; i < a.length; i++) {
            if (nonPairs.contains(a[i]) == true) {
                nonPairs.remove(a[i]);
            } else {
                nonPairs.add(a[i]);
            }
        }
        return (int) nonPairs.iterator().next();
    }
}
