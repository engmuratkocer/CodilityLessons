package lesson2_arrays;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OddOccurrencesInArray {


    public static void main(String[] args) {

        int n = 67;
        int a[] = {1, 2, 3, 4, 5, 2, 3, 4, 5};

        System.out.println(solution(a));
    }

    private static int solution(int[] a)
    {
        Set nonPairs = new HashSet();

        for (int i = 0; i < a.length; i++) {
            if (nonPairs.contains(a[i]) == true) {
                nonPairs.remove(a[i]);
            } else {
                nonPairs.add(a[i]);
            }
        }
        return (int)nonPairs.iterator().next();
    }
}
