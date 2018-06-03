package lesson8_leaders;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {


    public static void main(String[] args) {

        System.out.println(solution(new int[]{4, 3, 4, 4, 4, 2}));
    }


    private static int solution(int A[]) {

        int equiLeader = 0;
        boolean hasLeader = false;

        Map<Integer, Integer> equiMap = new HashMap<>();

        int maxOccurance =0;
        int maxOccuranceIndex =0;

        for (int elm : A) {

            if (equiMap.get(elm) != null) {
                int count = equiMap.get(elm)+1;
                equiMap.put(elm, count);

                if (count > maxOccurance)
                {
                    maxOccurance = count;
                    maxOccuranceIndex = elm;
                }
            }else{
                equiMap.put(elm, 1);
            }
        }

        System.out.println(equiMap);


        int half = A.length/maxOccurance;
        int minAllowedOccurance = 0;

        if (half%2 == 0){
            minAllowedOccurance += 2;
        }else{
            minAllowedOccurance += 1;
        }
        if (maxOccurance >= minAllowedOccurance){
            hasLeader = true;
        }

        if (hasLeader){

            Map<Integer, Integer> firstMap = new HashMap<>();
            Map<Integer, Integer> secondMap = new HashMap<>();

            for (int i = 0; i < A.length-1; i++) {
                for (int j = i; j < A.length; j++) {
                    int firstArr[] = new int[i+1];
                    int secondArr[] = new int[A.length-(i+1)];

                    for (int k = 0; k <firstArr.length ; k++) {
//                        firstArr[]
                    }

                    for (int k = 0; k <secondArr.length ; k++) {

                    }

                }
            }
        }

        return equiLeader;
    }
}