package lesson8_leaders;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Dominator
{


    @Test
    public void testDominator()
    {

        int A[] = new int[]{3, 4, 3, 2, 3, -1, 3, 3};

        int dominatorIndex = solution(A);

        assertEquals(7, dominatorIndex);

    }

    @Test
    public void testDominator_2()
    {

        int A[] = new int[]{3, 4, 3, 2, 3, -1, 3, 3,6};

        int dominatorIndex = solution(A);

        assertEquals(7, dominatorIndex);

    }

    @Test
    public void testDominator_3()
    {

        int A[] = new int[]{3, 4, 4, 2, 8, -1, 3, 3,6};

        int dominatorIndex = solution(A);

        assertEquals(-1, dominatorIndex);

    }


    public int solution(int[] A)
    {
        Map dominatorMap = new HashMap();
        int max = 0;
        int maxIndex = -1;

        for (int i = 0; i < A.length; i++)
        {
            if (dominatorMap.get(A[i]) == null)
            {
                dominatorMap.put(A[i], 1);
            } else
            {
                dominatorMap.put(A[i], (int) dominatorMap.get(A[i]) + 1);
            }

            if ((int) dominatorMap.get(A[i]) > (A.length/2) && (int) dominatorMap.get(A[i]) > max)
            {
                max = A[i];
                maxIndex = i;
            }

        }
        return maxIndex;
    }
}

