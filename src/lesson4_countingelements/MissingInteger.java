package lesson4_countingelements;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class MissingInteger
{
    @Test
    public static void main(String[] args)
    {
        assertEquals(3, solution(new int[]{2, 1, 5, 6}));
    }

    public static int solution(int[] A)
    {

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < A.length; i++)
        {
            set.add(A[i]);
        }

        for (int i = 1; i < A.length + 1; i++)
        {
            if (set.contains(i) == false)
            {
                return i;
            }
        }

        return 1;
    }

}